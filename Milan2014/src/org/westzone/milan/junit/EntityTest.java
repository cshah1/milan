package org.westzone.milan.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.westzone.milan.dao.HotelMapper;
import org.westzone.milan.dao.RegistrationMapper;
import org.westzone.milan.dao.RoomMapper;
import org.westzone.milan.model.Hotel;
import org.westzone.milan.model.Registration;
import org.westzone.milan.model.Room;

public class EntityTest {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "MapperConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testLoadHotel() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  Hotel hotel = session.getMapper(HotelMapper.class).selectByPrimaryKey(1);
		  logger.debug("Hotel found: " + hotel.getName());
		} finally {
		  session.close();
		}
	}
	
	@Test
	public void testLoadRoom() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  Room room = session.getMapper(RoomMapper.class).selectByPrimaryKey("HIKS100");
		  logger.debug("Hotel found: " + room.getHotelName());
		} finally {
		  session.close();
		}
	}
	
	@Test
	public void testLoadRoomsWithRegistrations() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  List<Room> rooms = session.getMapper(RoomMapper.class).getRoomsWithRegistrations();
		  logger.debug("Total rooms: " + rooms.size());
		  for(Room room:rooms) {
			  logger.debug("Room:    " + room.getVirtualRoomNum());
			  List<Registration> registrations = room.getRegistrations();
			  for(Registration registration:registrations) {
				  logger.debug("Registrant in room<" + room.getVirtualRoomNum() + ">: " + registration.getFullname());
			  }
		  }
		} finally {
		  session.close();
		}
	}
	
	@Test
	public void testLoadRegistrationsWithRooms() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
		  List<Registration> registrations = session.getMapper(RegistrationMapper.class).getRegistrationsWithRoom();
		  for(Registration registration:registrations) {
			  logger.debug("Registrant : " + registration.getFullname() + " ROOM num: " + registration.getRoomNum());
		  }
		} finally {
		  session.close();
		}
	}

}
