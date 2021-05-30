package com.dao;

import com.vo.Message;
import com.vo.Revert;

import java.util.List;

public interface RevertDAO {
    public List<Revert> getAllRevert(Message message);
    public Boolean insertRevert(Revert revert);
    public Boolean deleteRevert(Revert revert);
}
