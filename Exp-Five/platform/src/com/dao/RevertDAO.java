package com.dao;

import com.vo.Message;
import com.vo.Revert;

public interface RevertDAO {
    public Boolean searchAllRevert(Message message);
    public Boolean insertRevert(Revert revert);
    public Boolean deleteRevert(Revert revert);
}
