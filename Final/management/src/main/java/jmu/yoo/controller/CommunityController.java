package jmu.yoo.controller;

import jmu.yoo.service.CommunityService;
import jmu.yoo.vo.Community;
import org.junit.runner.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
@RequestMapping("/community")
public class CommunityController {

    @Resource(name = "communityServiceImpl")
    private CommunityService service;


    @RequestMapping("/showAllCommunity.do")
    public ModelAndView showAllCommunity() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("communityList", service.showAllCommunity());
        mv.setViewName("showAllCommunity");
        return mv;
    }


    @RequestMapping("/addCommunity.do")
    public ModelAndView addCommunity(Community community) {
        ModelAndView mv = new ModelAndView();
        service.addCommunity(community);
        mv.setViewName("redirect:/community/showAllCommunity.do");
        return mv;
    }

    @RequestMapping("/changeCommunity.do")
    public ModelAndView changeCommunity(Community community) {
        ModelAndView mv = new ModelAndView();
        service.changeCommunity(community);
        mv.setViewName("showAllCommunity");
        return mv;

    }

    @RequestMapping("findCommunity.do")
    public ModelAndView findCommunity(Integer cId, String status) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("community", service.findCommunityBycId(cId));
        mv.setViewName(status);
        return mv;
    }

    @RequestMapping("deleteCommunity.do")
    public ModelAndView deleteCommunity(Integer cId) {
        ModelAndView mv = new ModelAndView();
        Community community = new Community();
        community.setcId(cId);
        service.deleteCommunity(community);
        mv.setViewName("redirect:/community/showAllCommunity.do");
        return mv;
    }

    @RequestMapping("detailCommunity.do")
    public ModelAndView detailCommunity(Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("cId",cId);
        mv.setViewName("detailCommunity");
        return mv;
    }
}

