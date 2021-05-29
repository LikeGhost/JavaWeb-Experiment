package com.dao;

import com.vo.Message;

import java.util.List;

public interface MessageDAO {
    public Boolean insertMessage(Message message);
    public Boolean deleteMessage(Message message);
    public Message searchMessage(Message message);
    public List<Message> getAllMessage();
}
