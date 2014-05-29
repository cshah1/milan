package org.westzone.milan.junit;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.westzone.milan.dao.HotelMapper;
//import org.westzone.milan.model.Hotel;

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
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//		  Hotel hotel = session.getMapper(HotelMapper.class).selectByPrimaryKey(1);
//		  logger.debug("Hotel found: " + hotel.getName());
//		} finally {
//		  session.close();
//		}
	}

}
