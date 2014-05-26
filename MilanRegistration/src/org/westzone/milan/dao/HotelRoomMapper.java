package org.westzone.milan.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.westzone.milan.model.HotelRoom;
import org.westzone.milan.model.HotelRoomExample;

public interface HotelRoomMapper {
    int countByExample(HotelRoomExample example);

    int deleteByExample(HotelRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoom record);

    int insertSelective(HotelRoom record);

    List<HotelRoom> selectByExample(HotelRoomExample example);

    HotelRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HotelRoom record, @Param("example") HotelRoomExample example);

    int updateByExample(@Param("record") HotelRoom record, @Param("example") HotelRoomExample example);

    int updateByPrimaryKeySelective(HotelRoom record);

    int updateByPrimaryKey(HotelRoom record);
}