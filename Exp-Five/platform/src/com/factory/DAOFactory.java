package com.factory;

import com.dao.MessageDAO;
import com.dao.PersonDAO;
import com.dao.RevertDAO;
import com.dao.impl.MessageDAOImpl;
import com.dao.impl.PersonDAOImpl;
import com.dao.impl.RevertDAOImpl;

public class DAOFactory {
    public static MessageDAO getMessageDAOInstance(){
        return new MessageDAOImpl();
    }
    public static PersonDAO getPersonDAOInstance(){
        return new PersonDAOImpl();
    }
    public static RevertDAO getRevertDAOFactory(){
        return new RevertDAOImpl();
    }

}
