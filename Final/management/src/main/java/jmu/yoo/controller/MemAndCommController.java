package jmu.yoo.controller;

import jmu.yoo.service.MemAndCommService;
import jmu.yoo.vo.MemAndComm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/memAndComm")
public class MemAndCommController {

    @Resource(name="memAndCommServiceImpl")
    private MemAndCommService service;
    @RequestMapping("findMemAndCommIsOutCity.do")
    public ModelAndView findMemAndCommIsOutCity(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("memAndCommList",service.findMemAndCommIsOutCity());
        mv.setViewName("findMemAndCommIsOutCity");
        return mv;
    }
}
