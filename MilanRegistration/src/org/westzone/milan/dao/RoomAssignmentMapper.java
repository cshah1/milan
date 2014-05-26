package org.westzone.milan.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.westzone.milan.model.RoomAssignment;
import org.westzone.milan.model.RoomAssignmentExample;

public interface RoomAssignmentMapper {
    int countByExample(RoomAssignmentExample example);

    int deleteByExample(RoomAssignmentExample example);

    int deleteByPrimaryKey(Integer hotelRoomID);

    int insert(RoomAssignment record);

    int insertSelective(RoomAssignment record);

    List<RoomAssignment> selectByExample(RoomAssignmentExample example);

    RoomAssignment selectByPrimaryKey(Integer hotelRoomID);

    int updateByExampleSelective(@Param("record") RoomAssignment record, @Param("example") RoomAssignmentExample example);

    int updateByExample(@Param("record") RoomAssignment record, @Param("example") RoomAssignmentExample example);

    int updateByPrimaryKeySelective(RoomAssignment record);

    int updateByPrimaryKey(RoomAssignment record);
}