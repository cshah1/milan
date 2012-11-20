package org.computer.csvparser.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Ostermiller.util.CSVParser;
import com.Ostermiller.util.CSVPrinter;

public class CSVLabelPrinter {
	
	enum import_table_fields {INDEX, HOTEL, HOTEL_ROOM_NO, ROOM_TYPE, KENDRA, GROUP_NO, GROUP_COUNT };
	enum registration_table_fields {ORIGINAL_ID, KENDRA, GROUP_ID, LASTNAME, FIRSTNAME, VROOM_NO, HOTEL_ROOM_NO };
	
	
	private static final Log log = LogFactory.getLog(CSVLabelPrinter.class);
	
	private static final String DATA_FOLDER = "/home/cshah/Documents/Milan2012/output/";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String roomAssignmentFile 	= "RoomAssignment.csv";
		String registrationFile 	= "ThanksgivingMilanRegistrationList1.csv";
		
		
		log.debug("Parsing files: " + roomAssignmentFile + " " + registrationFile);
		
		String[][] roomAssignments = null;
		String[][] registrations = null;
		
		 
		try {
			
			roomAssignments = CSVLabelPrinter.parseCSV(roomAssignmentFile);
			registrations = CSVLabelPrinter.parseCSV(registrationFile);
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
		values = CSVLabelPrinter.fromRegistrations(rooms, registrations, roomTypes);
		CSVLabelPrinter.writeCSV(values, "VMRoom_Assignments.csv");
		
		
		
	}
	
	public static String[][] fromRegistrations(ArrayList<String> hotelRooms, String[][] registrations, ArrayList<String> roomTypes) {
		String values[][] = new String[hotelRooms.size()][7];
		int i = 0;
		
		for(String room:hotelRooms) {
			values[i][0] = room;
			values[i][1] = roomTypes.get(i);
			int cols = 2;
			for(int j = 0; j <901; j++) {
				
				String regRoom = registrations[j][6];
				String fName = registrations[j][3];
				String lName = registrations[j][2];
				
//				if(room.equals(regRoom)) {
//					if(names.toString().equals("")) {
//						names.append(fName).append(" ").append(lName);
//					}
//					else {
//						names.append("|").append(fName).append(" ").append(lName);
//					}
//				}
				if(room.equals(regRoom)) {
					StringBuffer names = new StringBuffer("");
					names.append(fName).append(" ").append(lName);
					try {
						values[i][cols++] = names.toString();
					}
					catch(Exception e) {
						System.out.println("Reg room: " + regRoom + " Name: " + names);
					}
				}
				
				
			}
			
			i++;
		}
		return values;
	}
	
	public static String[][] parseCSV(String fileName) throws FileNotFoundException, IOException{
		String result[][] = null;
		
		InputStream stream = CSVLabelPrinter.class.getClassLoader().getResourceAsStream(fileName);

		if (stream == null) {
			log.error("file missing: " + fileName);
			throw new FileNotFoundException(fileName + " is not found.");
		}
		BufferedReader reader = null;

		StringBuffer contents = new StringBuffer();
		
		reader = new BufferedReader(new InputStreamReader(stream));
		try {
	        String line = null; //not declared within while loop
	        
	        while (( line = reader.readLine()) != null){
	          contents.append(line);
	          contents.append(System.getProperty("line.separator"));
	        }
	      }
		catch(IOException e)
		{
			e.printStackTrace();
			throw e;
		}
	    finally {
	        try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		
		String input = contents.toString();
		
//		System.out.println(input);
		
		///* first two expressions clean the data
		// ex. ""What is the theme of the passage?"" or ""What is the mood of the author?""
		input = input.replaceAll("(\\s)(\")(\")", "$1$2");  // ""
		input = input.replaceAll("(\\?)(\")(\")", "$1$2");  // ""
		
		

		 
		result = CSVParser.parse(new StringReader(input));
		
		return result;
	}
	
	
	
	public static void writeCSV(String values[][], String fileName) {
		
//		URL url = CSVUtil.class.getClassLoader().getResource(fileName);
		
		File file = new File( DATA_FOLDER + fileName);
		
		OutputStream stream;
		try {
			if(!file.exists()) {
				System.out.println("Creating new file: " + file);
				file.createNewFile();
			}
			
			stream = new BufferedOutputStream(new FileOutputStream(file));
			
			if (stream == null) {
				log.error("file missing: " + file);
			}
			
			CSVPrinter printer = new CSVPrinter(stream);
			printer.writeln(values);
			
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
