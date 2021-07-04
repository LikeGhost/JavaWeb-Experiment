package jmu.yoo.service;

import jmu.yoo.vo.Community;
import jmu.yoo.vo.Member;

import java.util.List;

public interface MemberService {
    List<Member> showAllMemberBycId(Integer cId);
    int addMember(Member member);
    List<Member> findMemberByMName(String mName);
    Member findMemberByMId(Integer mId);
    int changeMember(Member member);
//    int deleteCommunity(Community community);
}
