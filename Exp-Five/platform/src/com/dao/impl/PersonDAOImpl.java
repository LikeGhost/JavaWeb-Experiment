package com.dao.impl;

import com.dao.PersonDAO;
import com.db.ConnectionManager;
import com.vo.Person;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public Person login(Person loginPerson) {
        String sql="select * from person where id=? and password=?";
        JdbcTemplate jt=new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.queryForObject(sql, new BeanPropertyRowMapper<>(Person.class),loginPerson.getId(),loginPerson.getPassword());



    }
    @Test
    public void test(){
        Person p=new Person();
        p.setId("2018110116");
        p.setPassword("123");
        if(login(p)!=null){
            System.out.println("登陆成功");
        }
    }
}
