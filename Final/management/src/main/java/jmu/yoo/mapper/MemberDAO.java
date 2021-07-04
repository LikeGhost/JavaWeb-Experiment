package jmu.yoo.mapper;


import jmu.yoo.vo.Community;
import jmu.yoo.vo.Member;

import java.util.List;

public interface MemberDAO {
    List<Member> selectAllMemberByCId(Integer cId);
    int insertMember(Member member);
    List<Member> selectMemberByMName(String mName);
    Member selectMemberByMId(Integer mId);
    int updateMember(Member member);
//    int deleteCommunity(Community community);
}

