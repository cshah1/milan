package org.westzone.milan.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.westzone.milan.model.Room;
import org.westzone.milan.model.RoomExample;

public interface RoomMapper {
    int countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(String virtualRoomNum);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(String virtualRoomNum);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    
    List<Room> getRoomsWithRegistrations();
}