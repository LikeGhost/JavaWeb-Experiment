package jmu.yoo.mapper;


import jmu.yoo.vo.Community;
import jmu.yoo.vo.Member;

import java.util.List;

public interface MemberDAO {
    List<Member> selectAllMemberByCId(Integer cId);
    int insertMember(Member member);
//    Community selectCommunityBycId(Integer cId);
//    int updateCommunity(Community community);
//    int deleteCommunity(Community community);
}

