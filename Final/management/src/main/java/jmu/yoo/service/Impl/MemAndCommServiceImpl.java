package jmu.yoo.service.Impl;

import jmu.yoo.mapper.MemAndCommDAO;
import jmu.yoo.service.MemAndCommService;
import jmu.yoo.vo.MemAndComm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemAndCommServiceImpl implements MemAndCommService {

    @Resource(name="memAndCommDAO")
    private MemAndCommDAO dao;
    @Override
    public List<MemAndComm> findMemAndCommIsOutCity() {
        return dao.selectMemAndCommIsOutCity();
    }
}
