package database;

import org.junit.Test;
import students.Student;

import java.util.List;

public class StudentDB {
    public static List<Student> getAllStudent(){
        String sql = "select sno,sname,sex,mno,birdate,memo from stu";
        return SqlServerTools.query(Student.class,sql);
    }
    public static void insertStudent(Student student){
        String sql="insert into stu(sno,sname,sex,mno,birdate,memo) values(?,?,?,?,?,?);";
        SqlServerTools.update(sql,student.getSno(),student.getSname(), student.isSex(),student.getMno(),student.getBirdate(),student.getMemo());

    }
    public static void updateStudent(Student student){
        String sql="update stu set sname=?,sex=?,mno=?,birdate=?,memo=? where sno=?;" ;
        SqlServerTools.update(sql,student.getSname(), student.isSex(),student.getMno(),student.getBirdate(),student.getMemo(),student.getSno());

    }
    public static Student getStudentBySno(String sno){
        String sql="select sno,sname,sex,mno,birdate,memo from stu where sno=?";
        List<Student> students=SqlServerTools.query(Student.class,sql,sno);
        return students.get(0);
    }
    public static void deleteStudent(String sno){
        String sql="delete from stu where sno=?";
        SqlServerTools.update(sql,sno);
    }
    public static List<Student> getStudentLike(String key){
        key="%"+key+"%";
        String sql="select sno,sname,sex,mno,birdate,memo from stu where  sno like ? or sname like ?";
        return SqlServerTools.query(Student.class,sql,key,key);
    }
    public static List<Student> getStudentLike(Boolean key){
        String sql="select sno,sname,sex,mno,birdate,memo from stu where  sex = ?";
        return SqlServerTools.query(Student.class,sql,key);
    }

}
