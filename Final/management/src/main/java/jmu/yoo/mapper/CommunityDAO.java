package jmu.yoo.mapper;

import jmu.yoo.vo.Community;

import java.util.List;

public interface CommunityDAO {

    List<Community> selectAllCommunity();
    int insertCommunity(Community community);
    Community selectCommunityBycId(Integer cId);
    int updateCommunity(Community community);
    int deleteCommunity(Community community);
}
