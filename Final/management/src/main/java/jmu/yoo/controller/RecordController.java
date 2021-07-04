package jmu.yoo.controller;

import jmu.yoo.mapper.MemberDAO;
import jmu.yoo.service.CommunityService;
import jmu.yoo.service.MemberService;
import jmu.yoo.service.RecordService;
import jmu.yoo.vo.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/record")
public class RecordController {
    @Resource(name="communityServiceImpl")
    private CommunityService commService;
    @Resource(name="memberServiceImpl")
    private MemberService memService;
    @Resource(name="recordServiceImpl")
    private RecordService recService;
    @RequestMapping("/addRecordToCommunity")
    public ModelAndView addRecordToCommunity(Record record){
        ModelAndView mv=new ModelAndView();
        recService.addRecord(record);
        mv.setViewName("redirect:/community/findCommunity.do?cId="+record.getCId()+"&status=findCommunity");
        return mv;
    }
}
