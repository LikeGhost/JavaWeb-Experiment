package jmu.yoo.service.Impl;

import jmu.yoo.mapper.CommunityDAO;
import jmu.yoo.service.CommunityService;
import jmu.yoo.vo.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Resource(name="communityDAO")
    private CommunityDAO dao;
    @Override
    public List<Community> showAllCommunity() {
       return  dao.selectAllCommunity();
    }

    @Override
    public int addCommunity(Community community) {

        return dao.insertCommunity(community);
    }

    @Override
    public Community findCommunityBycId(Integer cId) {
        return dao.selectCommunityBycId(cId);
    }

    @Override
    public int changeCommunity(Community community) {
        return dao.updateCommunity(community);
    }

    @Override
    public int deleteCommunity(Community community) {
        return dao.deleteCommunity(community);
    }
}
