package com.dao;

import com.vo.Message;
import com.vo.Revert;

import java.util.List;

public interface RevertDAO {
    List<Revert> getAllRevert(Message message);
    Boolean insertRevert(Revert revert);
    Boolean deleteRevert(Revert revert);
}
