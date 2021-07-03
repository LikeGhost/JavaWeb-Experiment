package jmu.yoo.controller;

import jmu.yoo.service.CommunityService;
import jmu.yoo.service.MemberService;
import jmu.yoo.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource(name="memberServiceImpl")
    private MemberService memService;

    @Resource(name = "communityServiceImpl")
    private CommunityService commService;

    @RequestMapping("/showAllMemberBycId.do")
    public ModelAndView showAllMember(Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("memberList",memService.showAllMemberBycId(cId));
        mv.addObject("community",commService.findCommunityBycId(cId));
        mv.setViewName("showAllMember");
        return mv;
    }

    @RequestMapping("/addMemberToCommunity.do")
    public ModelAndView addMemberToCommunity(Member member){
        ModelAndView mv=new ModelAndView();
        memService.addMember(member);
        mv.setViewName("redirect:/community/findCommunity.do?cId="+member.getCId()+"&status=showDetailCommunity");
        return mv;
    }
}
