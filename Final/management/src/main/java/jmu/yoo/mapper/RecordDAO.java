package jmu.yoo.mapper;

import jmu.yoo.vo.Member;
import jmu.yoo.vo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RecordDAO {
    int insertRecord(Record record);

    List<Map<Object,Object>>selectAllRecordByCId(Integer cId);
    List<Map<Object,Object>> selectAllRecordByMNameAndCId(@Param("mName") String mName, @Param("cId") Integer cId);

    int updateRecord(Record record);

    int deleteRecord(Integer rId);

    int deleteRecordByMId(Integer mId);

    int deleteRecordByCId(Integer cId);

}
