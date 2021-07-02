package jmu.yoo.vo;


import jmu.yoo.mapper.CommunityDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Community {
    private int id;
    private String cName;
    private String cProvince;
    private String cCity;
    private String cStreet;
    private String cTel;

    public Community() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet;
    }

    public String getcTel() {
        return cTel;
    }

    public void setcTel(String cTel) {
        this.cTel = cTel;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                ", cName='" + cName + '\'' +
                ", cProvince='" + cProvince + '\'' +
                ", cCity='" + cCity + '\'' +
                ", cStreet='" + cStreet + '\'' +
                ", cTel='" + cTel + '\'' +
                '}';
    }
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        CommunityDAO communityDAO =(CommunityDAO) ac.getBean("communityDAO");
        Community a=new Community();
        a.cName="asdad";
        a.cCity="asdasd";
        System.out.println(communityDAO.insertCommunity(a));
    }
}
