package com.factory;

import com.dao.PersonDAO;
import com.dao.impl.PersonDAOImpl;

public class PersonDAOFactory {
    public static PersonDAO getPersonDAOInstance(){
        return new PersonDAOImpl();
    }
}
