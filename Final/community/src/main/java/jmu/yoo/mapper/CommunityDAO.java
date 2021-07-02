package jmu.yoo.mapper;

import jmu.yoo.vo.Community;

import java.util.List;

public interface CommunityDAO {

    List<Community> selectAllCommunity();
    int insertCommunity(Community community);
}
