package org.computer.csvimport.junit;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.computer.csvparser.util.CSVUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CSVImportTest {
	
	private String fileName;
	private String[][] rows;

	@Before
	public void setUp() throws Exception {
		fileName = System.getProperty("data.fileName");
	}

	@Test
	public void testParseCSV() {
		String[][] results = null;
		try {
			results = CSVUtil.parseCSV(fileName);
		} catch (FileNotFoundException e) {
			fail("Missing File");
		} catch (IOException e) {
			fail("Parsing Error.");
		}
		assertNotNull(results);
		rows = results;
	}

	
	@After 
	public void testGenerateRowObjects() {
		assertTrue((rows.length > 0));
		
		//assertEquals(new Long(rowObjects.size()), new Long(rows.length));
	}
}
