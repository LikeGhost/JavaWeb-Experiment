package jmu.yoo.controller;

import jmu.yoo.service.CommunityService;
import jmu.yoo.vo.Community;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;



@Controller
@RequestMapping("/community")
public class CommunityController {

    @Resource(name="communityServiceImpl")
    private CommunityService service;



    @RequestMapping("/showAllCommunity.do")
    public ModelAndView showAllCommunity(){

        ModelAndView mv=new ModelAndView();
        mv.addObject("communityList",service.showAllCommunity());
        mv.setViewName("showAllCommunity");
        return mv;
    }


    @RequestMapping("/addCommunity.do")
    public ModelAndView addCommunity(Community community){
        ModelAndView mv=new ModelAndView("redirect:/");
        service.addCommunity(community);
        return mv;
    }
}

