package students;


import java.util.Date;

public class Student {
    private String sno;
    private String sname;
    private boolean sex;
    private String mno;
    private Date birdate;
    private String memo;



    public String getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public boolean isSex() {
        return sex;
    }

    public String getMno() {
        return mno;
    }

    public Date getBirdate() {
        return birdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public void setBirdate(Date birdate) {
        this.birdate = birdate;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sex=" + sex +
                ", mno='" + mno + '\'' +
                ", birdate=" + birdate +
                ", memo='" + memo + '\'' +
                '}';
    }
}
