package org.westzone.milan.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.westzone.milan.model.HotelRoomAvailability;
import org.westzone.milan.model.HotelRoomAvailabilityExample;
import org.westzone.milan.model.HotelRoomAvailabilityKey;

public interface HotelRoomAvailabilityMapper {
    int countByExample(HotelRoomAvailabilityExample example);

    int deleteByExample(HotelRoomAvailabilityExample example);

    int deleteByPrimaryKey(HotelRoomAvailabilityKey key);

    int insert(HotelRoomAvailability record);

    int insertSelective(HotelRoomAvailability record);

    List<HotelRoomAvailability> selectByExample(HotelRoomAvailabilityExample example);

    HotelRoomAvailability selectByPrimaryKey(HotelRoomAvailabilityKey key);

    int updateByExampleSelective(@Param("record") HotelRoomAvailability record, @Param("example") HotelRoomAvailabilityExample example);

    int updateByExample(@Param("record") HotelRoomAvailability record, @Param("example") HotelRoomAvailabilityExample example);

    int updateByPrimaryKeySelective(HotelRoomAvailability record);

    int updateByPrimaryKey(HotelRoomAvailability record);
}