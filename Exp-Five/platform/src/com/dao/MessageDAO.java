package com.dao;

import com.vo.Message;

import java.util.List;

public interface MessageDAO {
    Boolean insertMessage(Message message);
    Boolean deleteMessage(Message message);
    Message searchMessage(Message message);
    List<Message> getAllMessage();
}
