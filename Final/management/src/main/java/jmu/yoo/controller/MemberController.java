package jmu.yoo.controller;

import jmu.yoo.service.CommunityService;
import jmu.yoo.service.MemberService;
import jmu.yoo.service.RecordService;
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

    @Resource(name="recordServiceImpl")
    private RecordService recService;
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
        mv.setViewName("redirect:/community/findCommunity.do?cId="+member.getCId()+"&status=findCommunity");
        return mv;
    }
    @RequestMapping("/findMemberByMName.do")
    public ModelAndView findMemberByCName(String mName,Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("memberList",memService.findMemberByMName(mName));
        mv.addObject("searchName",mName);
        mv.addObject("cId",cId);
        mv.setViewName("findMember");
        return mv;
    }
    @RequestMapping("/preChangeMember.do")
    public ModelAndView preChangeMember(Integer mId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("member",memService.findMemberByMId(mId));
       // mv.addObject("recordList",recService)
        mv.setViewName("changeMember");
        return mv;
    }
    @RequestMapping("/changeMember.do")
    public ModelAndView changeMember(Member member){
        ModelAndView mv=new ModelAndView();
        memService.changeMember(member);
        mv.setViewName("redirect:/member/showAllMemberBycId.do?cId="+member.getCId());
        return mv;
    }

}
