package database;


import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SqlServerTools {
    private final static String url="jdbc:sqlserver://localhost:1433;"+
            "databaseName=xscj1;integratedSecurity=true;";
    public static Connection  getConnection(){
        Connection connection =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return connection;
    }
    public static void closeConnection(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
        try {
            if (resultSet != null) {

                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static<T> List<T> query(Class<T> clazz,String sql, Object ... args){
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
            closeConnection(connection,preparedStatement,resultSet);

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
            SqlServerTools.closeConnection(connection, preparedStatement, null);
        }
    }

}
