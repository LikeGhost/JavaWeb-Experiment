package jmu.yoo.controller;

import jmu.yoo.service.CommunityService;
import jmu.yoo.service.MemberService;
import jmu.yoo.vo.Community;
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

    @RequestMapping("/showAllMemberBycId")
    public ModelAndView showAllMember(Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("memberList",memService.showAllMemberBycId(cId));
        mv.addObject("community",commService.findCommunityBycId(cId));
        mv.setViewName("showAllMember");
        return mv;
    }
    @RequestMapping("/addMemberToCommunity")
    public ModelAndView addMemberToCommunity(){

        return null;
    }
}
