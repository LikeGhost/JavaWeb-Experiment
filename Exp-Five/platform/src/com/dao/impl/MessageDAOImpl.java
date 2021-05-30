package com.dao.impl;

import com.dao.MessageDAO;
import com.db.ConnectionManager;
import com.factory.DAOFactory;
import com.vo.Message;
import com.vo.Revert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MessageDAOImpl implements MessageDAO {
    @Override
    public Boolean insertMessage(Message message) {
        String sql="insert into message(title,content,writer,writeDate) values(?,?,?,?)";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.update(sql,message.getTitle(),message.getContent(),message.getWriter(),message.getWriteDate())==1;
    }

    @Override
    public Boolean deleteMessage(Message message) {
        String sql="delete from message where messageId=?";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        Revert revert = new Revert();
        revert.setMessageId(message.getMessageId());
        DAOFactory.getRevertDAOFactory().deleteRevert(revert);
        return jt.update(sql,message.getMessageId())==1;

    }

    @Override
    public Message searchMessage(Message message) {
        String sql="select * from message where messageId=?";
        JdbcTemplate jt = new JdbcTemplate(ConnectionManager.getDataSource());
        return jt.queryForObject(sql,new BeanPropertyRowMapper<>(Message.class),message.getMessageId());

    }

    @Override
    public List<Message> getAllMessage() {
        String sql="select * from Message";
        JdbcTemplate jt=new JdbcTemplate(ConnectionManager.getDataSource());
//        jt.queryForObject()
        return jt.query(sql, new BeanPropertyRowMapper<>(Message.class));
    }

    @Test
    public void test(){
//       List<Message>list=getAllMessage();
//        for (Message message : list) {
//            System.out.println(message);
//        }
        Message message = new Message();
        message.setMessageId(10);
        System.out.println(deleteMessage(message));
    }
}
