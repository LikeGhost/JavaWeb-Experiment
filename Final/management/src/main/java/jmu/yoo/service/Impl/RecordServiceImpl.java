package jmu.yoo.service.Impl;

import jmu.yoo.mapper.RecordDAO;
import jmu.yoo.service.RecordService;
import jmu.yoo.vo.Record;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RecordServiceImpl implements RecordService {

    @Resource(name="recordDAO")
    RecordDAO dao;
    @Override
    public int addRecord(Record record) {
        return dao.insertRecord(record);
    }
}
