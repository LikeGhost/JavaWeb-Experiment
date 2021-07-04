package jmu.yoo.controller;

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
    @RequestMapping("/addRecordToCommunity.do")
    public ModelAndView addRecordToCommunity(Record record){
        ModelAndView mv=new ModelAndView();
        recService.addRecord(record);
        mv.setViewName("redirect:/community/findCommunity.do?cId="+record.getCId()+"&status=findCommunity");
        return mv;
    }

    @RequestMapping("/preShowAllRecordByCId.do")
    public ModelAndView preShowAllRecordByCId(Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("recordList",recService.showAllRecordByCId(cId));
        mv.addObject("cId",cId);
        mv.setViewName("showAllRecord");
        return mv;
    }

    @RequestMapping("/findRecordByMNameAndCId.do")
    public ModelAndView findRecordByMNameAndCId(String mName,Integer cId){
        ModelAndView mv=new ModelAndView();
        mv.addObject("recordList",recService.showAllRecordByMNameAndCId(mName,cId));
        mv.addObject("searchName",mName);
        mv.addObject("cId",cId);
        mv.setViewName("showAllRecord");
        return mv;
    }

    @RequestMapping("/changRecord.do")
    public ModelAndView changRecordByRId(Record record){
        ModelAndView mv=new ModelAndView();
        recService.changeRecord(record);
        mv.setViewName("redirect:/record/preShowAllRecordByCId.do?cId="+record.getCId());
        return mv;
    }
    @RequestMapping("/deleteRecord.do")
    public ModelAndView deleteRecord(Integer rId,Integer cId){
        ModelAndView mv=new ModelAndView();

        recService.deleteRecord(rId);
        mv.setViewName("redirect:/record/preShowAllRecordByCId.do?cId="+cId);
        return mv;
    }

}
