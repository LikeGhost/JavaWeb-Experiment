package com.factory;

import com.dao.MessageDAO;
import com.dao.impl.MessageDAOImpl;

public class MessageDAOFactory {
    public static MessageDAO getMessageDAOInstance(){
        return new MessageDAOImpl();
    }
}
