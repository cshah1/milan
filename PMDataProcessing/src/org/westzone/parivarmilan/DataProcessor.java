package org.westzone.parivarmilan;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
			
			roomAssignments = CSVUtil.parseCSV(roomAssignmentFile, null);
			registrations = CSVUtil.parseCSV(registrationFile, null);
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
	
	
	/**
	 * @param roomAssignmentFile
	 * @param registrationFile
	 */
	public static void verifyRoomAssignmentFiles(String roomAssignmentFile, String registrationFile) {


//		String roomAssignmentFile = "RoomAssignment.csv";
//		String registrationFile = "ThanksgivingMilanRegistrationList1.csv";
		
		
		log.debug("Parsing files: " + roomAssignmentFile + " " + registrationFile);
		
		String[][] roomAssignments = null;
		String[][] registrations = null;
		
		 
		try {
			
			roomAssignments = CSVUtil.parseCSV(roomAssignmentFile, null);
			registrations = CSVUtil.parseCSV(registrationFile, null);
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
		
		for(int i = 50; i < 175; i++) {
			rooms.add(roomAssignments[i][2]);
			roomTypes.add(roomAssignments[i][3]);
		}
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
	
	public static void main(String[] args) {
		DataProcessor.verifyHotelRooms("ThanksgivingMilanRegistrationList_V4.csv", "RoomAssignment_V4.csv");
	}
	
	public static boolean verifyHotelRooms(String registrationFile, String roomAssignmentFile) {
		boolean result = true;
		int roomAssignmentKeyIndex = 2;
		int roomAssignmentKendraIndex = 4;
		int roomAssignmentKendraGroupIndex = 5;
		
		String[] labels = new String[RegistrationColLabels.values().length];
		RegistrationColLabels[] colLabels;
		for(int i = 0; i < (colLabels = RegistrationColLabels.values()).length; i++) {
			labels[i] = colLabels[i].toString();
		}
		
		String[][] roomAssignments;
		String[][] registrations;
		try {
			roomAssignments = CSVUtil.parseCSV(roomAssignmentFile, null);
			registrations = CSVUtil.parseCSV(registrationFile, labels);
		} catch (FileNotFoundException e) {
			log.error("File not found: " + e);
			return false;
		} catch (IOException e) {
			log.error("Exception reading file");
			return false;
		}
		
		
		String[][] resultData = new String[roomAssignments.length][6];
		int i = 0;
				
//		boolean skipFirst = true;
		
		for(String[] room : roomAssignments) {
			String roomNo = room[roomAssignmentKeyIndex];
			String groupCode = room[roomAssignmentKendraIndex]+"::"+room[roomAssignmentKendraGroupIndex];
			boolean found = false;
			resultData[i][0] = roomNo;
			int j = 1;
			for(String[] registration : registrations) {
//				if(skipFirst == true) {
//					skipFirst = false;
//					continue;
//				}
				
				String regRoomNo = registration[RegistrationColLabels.VirtualRoomNumber.ordinal()];
				String zoneRoomNo = registration[RegistrationColLabels.ZoneRoomNumber.ordinal()];
				
				if(roomNo.equals(regRoomNo)) {
					
					resultData[i][j] = registration[RegistrationColLabels.FirstName.ordinal()] + " " + registration[RegistrationColLabels.LastName.ordinal()];
					found = true;
					j++;
				}
				
			}
			if(!found) {
				log.debug("No one is assigned for Room: " + roomNo);
//				result = false;
//				break;
			}
			i++;
		}
		
		if(result)
			CSVUtil.writeCSV(resultData, "VerifiedRegistrations.csv");
		
		return result;
	}
	enum RegistrationColLabels  {OriginalId, Kendra, FamilyId, LastName, FirstName, ZoneRoomNumber, VirtualRoomNumber};
}
