package com.dao;

import com.vo.Message;

public interface MessageDAO {
    public Boolean insertMessage(Message message);
    public Boolean deleteMessage(Message message);
    public Message searchMessage(Message message);
}
