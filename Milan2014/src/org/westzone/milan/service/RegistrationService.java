package org.westzone.milan.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.westzone.milan.dao.RegistrationMapper;
import org.westzone.milan.model.Registration;

public class RegistrationService extends BaseService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private static RegistrationService service;
	
	private RegistrationService() {}
	
	public static RegistrationService getInstance() {
		if(service == null) {
			service = new RegistrationService();
		}
		return service;
	}
	
	public List<Registration> getRegistrations() {
		SqlSession session = this.getSession();
		List<Registration> registrations = null;
		try {
		  registrations = session.getMapper(RegistrationMapper.class).getRegistrationsWithRoom();
		  for(Registration registration:registrations) {
			  logger.debug("Registrant : " + registration.getFullname() + " ROOM num: " + registration.getRoomNum());
		  }
		} finally {
		  session.close();
		}
		return registrations;
	}

}
