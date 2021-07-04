package jmu.yoo.service.Impl;

import jmu.yoo.mapper.RecordDAO;
import jmu.yoo.service.RecordService;
import jmu.yoo.vo.Record;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RecordServiceImpl implements RecordService {

    @Resource(name="recordDAO")
    RecordDAO dao;
    @Override
    public int addRecord(Record record) {
        return dao.insertRecord(record);
    }

    @Override
    public List<Map<Object,Object>> showAllRecordByCId(Integer cId) {
        return dao.selectAllRecordByCId(cId);
    }

    @Override
    public List<Map<Object,Object>> showAllRecordByMNameAndCId(String mName,Integer cId) {

        return dao.selectAllRecordByMNameAndCId(mName,cId);
    }

    @Override
    public int changeRecord(Record record) {
        return dao.updateRecord(record);
    }

    @Override
    public int deleteRecord(Integer rId) {
        return dao.deleteRecord(rId);
    }

    @Override
    public int deleteRecordByMId(Integer mId) {
        return dao.deleteRecordByMId(mId);
    }

    @Override
    public int deleteRecordByCId(Integer cId) {

        return dao.deleteRecordByCId(cId);
    }
}
