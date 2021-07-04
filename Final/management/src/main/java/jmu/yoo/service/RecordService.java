package jmu.yoo.service;


import jmu.yoo.vo.Community;
import jmu.yoo.vo.Record;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public interface RecordService {
//    List<Community> showAllCommunity();
    int addRecord(Record record);

    List<Map<Object,Object>> showAllRecordByCId(Integer cId);

    List<Map<Object,Object>> showAllRecordByMNameAndCId(String mName, Integer cId);

    int changeRecord(Record record);

    int deleteRecord(Integer rId);

    int deleteRecordByMId(Integer mId);

    int deleteRecordByCId(Integer cId);
//    Community findCommunityBycId(Integer cId);
//    int changeCommunity(Community community);
//    int deleteCommunity(Community community);
}
