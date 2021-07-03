package jmu.yoo.service.Impl;

import jmu.yoo.mapper.MemberDAO;
import jmu.yoo.service.MemberService;
import jmu.yoo.vo.Member;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource(name="memberDAO")
    private MemberDAO dao;

    @Override
    public List<Member> showAllMemberBycId(Integer cId) {
        return dao.selectAllMemberByCId(cId);
    }
}
