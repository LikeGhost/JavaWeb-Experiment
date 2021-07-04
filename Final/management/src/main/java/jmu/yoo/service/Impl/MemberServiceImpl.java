package jmu.yoo.service.Impl;

import jmu.yoo.mapper.MemberDAO;
import jmu.yoo.mapper.RecordDAO;
import jmu.yoo.service.MemberService;
import jmu.yoo.vo.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource(name="memberDAO")
    private MemberDAO dao;

    @Resource(name="recordDAO")
    private RecordDAO recDao;


    @Override
    public List<Member> showAllMemberBycId(Integer cId) {
        return dao.selectAllMemberByCId(cId);
    }

    @Override
    public int addMember(Member member) {
        return dao.insertMember(member);
    }

    @Override
    public List<Member> findMemberByMName(String mName) {
        return dao.selectMemberByMName(mName);
    }

    @Override
    public Member findMemberByMId(Integer mId) {
        return dao.selectMemberByMId(mId);
    }

    @Override
    public int changeMember(Member member) {
        return dao.updateMember(member);
    }

    @Override
    public int deleteMember(Integer mId) {
        return dao.deleteMember(mId);
    }

    @Override
    public int deleteMemberByCId(Integer cId) {
        List<Member>list=dao.selectAllMemberByCId(cId);
        for (Member member : list) {
            recDao.deleteRecordByMId(member.getMId());
        }
        return dao.deleteMemberByCId(cId);
    }
}
