package jmu.yoo.service;

import jmu.yoo.vo.Community;
import jmu.yoo.vo.Member;

import java.util.List;

public interface MemberService {
    List<Member> showAllMemberBycId(Integer cId);
    int addMember(Member member);
//    Community findCommunityBycId(Integer cId);
//    int changeCommunity(Community community);
//    int deleteCommunity(Community community);
}
