package com.dao.impl;

import com.dao.RevertDAO;
import com.db.ConnectionManager;
import com.vo.Message;
import com.vo.Revert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RevertDAOImpl implements RevertDAO {
    @Override
    public List<Revert> getAllRevert(Message message) {
        String sql="select * from revert where messageId=?";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.query(sql,new BeanPropertyRowMapper<>(Revert.class),message.getMessageId());
    }

    @Override
    public Boolean insertRevert(Revert revert) {
        String sql="insert into revert(messageId,content,writer,writeDate)values(?,?,?,?)";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.update(sql,revert.getMessageId(),revert.getContent(),revert.getWriter(),revert.getWriteDate())==1;
    }

    @Override
    public Boolean deleteRevert(Revert revert) {
        String sql="delete from revert where revertId=? or messageId=?";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.update(sql,revert.getRevertId(),revert.getMessageId())==1;
    }
    @Test
    public void test(){
        Revert revert = new Revert();
        revert.setRevertId(2);
        System.out.println(deleteRevert(revert));
    }
}
