package com.factory;

import com.dao.RevertDAO;
import com.dao.impl.RevertDAOImpl;

public class RevertDAOFactory {
    public static RevertDAO getRevertDAOFactory(){
        return new RevertDAOImpl();
    }
}
