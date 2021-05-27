package com.db;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionManager {
    //没有使用连接池以及配置文件的方式
/*  private final static String driver ="com.mysql.cj.jdbc.Driver";
    private final static String url="jdbc:mysql://localhost:3306/exp5?serverTimezone=Asia/Shanghai";
    private final static String user="root";
    private final static String password="123456";*/
    private static DataSource ds;

    static {
        Properties pro=new Properties();

        try {
            pro.load(ConnectionManager.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds=DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static  Connection getConnection(){




        Connection conn=null;
        //没有使用连接池以及配置文件的方式

/*        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,password);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

 */
        try {
            conn=ds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;

    }
    public static void close(Connection conn, PreparedStatement ps){
        close(conn,ps,null);

    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
    public static DataSource getDataSource(){
        return ds;
    }
    public static<T> List<T> query(Class<T> clazz, String sql, Object ... args){
        Connection connection=getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        ArrayList<T> list=null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            resultSet=preparedStatement.executeQuery();

            ResultSetMetaData rsmd=resultSet.getMetaData();
            int colCount=rsmd.getColumnCount();
            list=new ArrayList<>();
            while(resultSet.next()){
                T t=clazz.newInstance();
                for (int i = 0; i < colCount; i++) {
                    Object colValue=resultSet.getObject(i+1);
                    String colLabel=rsmd.getColumnLabel(i+1);
                    Field field=clazz.getDeclaredField(colLabel);
                    field.setAccessible(true);
                    field.set(t,colValue);
                }
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            close(connection,preparedStatement,resultSet);

        }
        return list;

    }
    public static void update(String sql,Object ...args) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i + 1, args[i]);
            }
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, preparedStatement, null);
        }
    }
    @Test
    public void test(){
        Connection conn=getConnection();
        System.out.println(conn);
    }
}
