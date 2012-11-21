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

public class CSVUtil {
	
	enum import_table_fields {INDEX, HOTEL, HOTEL_ROOM_NO, ROOM_TYPE, KENDRA, GROUP_NO, GROUP_COUNT };
	enum registration_table_fields {ORIGINAL_ID, KENDRA, GROUP_ID, LASTNAME, FIRSTNAME, VROOM_NO, HOTEL_ROOM_NO };
	
	
	private static final Log log = LogFactory.getLog(CSVUtil.class);
	
	private static final String DATA_FOLDER = "/home/cshah/Documents/Milan2012/output/";
	
	public static void merge(String originalFilePath, String modifiedFilePath, String idColumn)
	{
	}
	
	
	public static void merge(int originalFileIdColumnIndex, String[][] originalFile, int modifiedFileIdColumnIndex, String[][] modifiedFile, int[] newColumnIndexes, String mergedFileName)
	{
		String[][] mergedFile = new String[originalFile.length][originalFile[0].length + newColumnIndexes.length];

		// We have both files in array format now
		
		// For each row in the modified file, find the corresponding row in the source file
		for (int i = 0; i < modifiedFile.length; i++)
		{
			boolean found = false;
			String id = modifiedFile[i][modifiedFileIdColumnIndex];
			
			for(int j = 0; j < originalFile.length; j++) {
				
				for(int k = 0; k < originalFile[j].length; k++) {
					mergedFile[j][k] = originalFile[j][k];
				}
				
				String idInSource = originalFile[j][originalFileIdColumnIndex];
				
				                                    
				// We found the key in the source file, append the modified file's column to it
				if (id == idInSource)
				{
					found = true;
					for(int m = 0; m < newColumnIndexes.length; ) {
						mergedFile[j][originalFile[j].length + ++m] = modifiedFile[i][newColumnIndexes[m]];
					}
				}
				
			}
			
			if(!found) {
				// We did not find the key in the source file
				log.debug("Id not found in the original file: " + id);
			}
		}
		
		// now generate merged csv
		CSVUtil.writeCSV(mergedFile, mergedFileName);
	}
	
	
	public static String[][] fromRegistrations(ArrayList<String> hotelRooms, String[][] registrations, ArrayList<String> roomTypes) {
		String values[][] = new String[hotelRooms.size()][7];
		int i = 0;
		
		for(String room:hotelRooms) {
			values[i][0] = room;
			values[i][1] = roomTypes.get(i);
			int cols = 2;
			for(int j = 0; j < 901; j++) {
				
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
		
		InputStream stream = CSVUtil.class.getClassLoader().getResourceAsStream(fileName);

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
