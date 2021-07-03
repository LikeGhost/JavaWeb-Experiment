package jmu.yoo.service;

import jmu.yoo.vo.Community;

import java.util.List;

public interface CommunityService {
     List<Community> showAllCommunity();
     int addCommunity(Community community);
     Community findCommunityBycId(Integer cId);
     int changeCommunity(Community community);
     int deleteCommunity(Community community);
}
