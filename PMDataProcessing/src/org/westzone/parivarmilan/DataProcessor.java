package org.westzone.parivarmilan;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.westzone.parivarmilan.util.CSVUtil;

public class DataProcessor {
	
	private static final Log log = LogFactory.getLog(DataProcessor.class);
	
	
	/**
	 * @param roomAssignmentFile
	 * @param registrationFile
	 */
	public static void createRoomAssignmentFiles(String roomAssignmentFile, String registrationFile) {


//		String roomAssignmentFile = "RoomAssignment.csv";
//		String registrationFile = "ThanksgivingMilanRegistrationList1.csv";
		
		
		log.debug("Parsing files: " + roomAssignmentFile + " " + registrationFile);
		
		String[][] roomAssignments = null;
		String[][] registrations = null;
		
		 
		try {
			
			roomAssignments = CSVUtil.parseCSV(roomAssignmentFile);
			registrations = CSVUtil.parseCSV(registrationFile);
		} 
		catch (IOException e) {
			log.error(e);
			e.printStackTrace();
			return;
		}
		
		
		ArrayList<String> rooms = new ArrayList<String>();
		ArrayList<String> roomTypes = new ArrayList<String>();
		String values[][];
		

//		Holiday Inn
		
//		for(int i = 50; i < 175; i++) {
//			rooms.add(roomAssignments[i][2]);
//			roomTypes.add(roomAssignments[i][3]);
//		}
//		values = CSVUtil.fromRegistrations(rooms, registrations, roomTypes);
//		CSVUtil.writeCSV(values, "HIRoom_Assignments.csv");
		
//		Comfort Inn
//		rooms.clear(); roomTypes.clear();
//		for(int i = 0; i < 50; i++) {
//			rooms.add(roomAssignments[i][2]);
//			roomTypes.add(roomAssignments[i][3]);
//		}
//		values = CSVUtil.fromRegistrations(rooms, registrations, roomTypes);
//		CSVUtil.writeCSV(values, "CIRoom_Assignments.csv");

//		ABVI
//		rooms.clear(); roomTypes.clear();
//		for(int i = 175; i < 200; i++) {
//			rooms.add(roomAssignments[i][2]);
//			roomTypes.add(roomAssignments[i][3]);
//		}
//		values = CSVUtil.fromRegistrations(rooms, registrations, roomTypes);
//		CSVUtil.writeCSV(values, "ABVIRoom_Assignments.csv");
		
		// Motel 6
//		rooms.clear(); roomTypes.clear();
//		for(int i = 200; i < 235; i++) {
//			rooms.add(roomAssignments[i][2]);
//			roomTypes.add(roomAssignments[i][3]);
//		}
//		values = CSVUtil.fromRegistrations(rooms, registrations, roomTypes);
//		CSVUtil.writeCSV(values, "M6Room_Assignments.csv");
		

//		Virtual Motel
		rooms.clear(); roomTypes.clear();
		for(int i = 235; i < 245; i++) {
			rooms.add(roomAssignments[i][2]);
			roomTypes.add(roomAssignments[i][3]);
		}
		values = CSVUtil.fromRegistrations(rooms, registrations, roomTypes);
		CSVUtil.writeCSV(values, "VMRoom_Assignments.csv");
		
		
		
	}

}
