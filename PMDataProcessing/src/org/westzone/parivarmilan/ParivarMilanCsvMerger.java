package org.westzone.parivarmilan;

import java.util.ArrayList;

import org.westzone.parivarmilan.util.CSVUtil;

public class ParivarMilanCsvMerger 
{
	public static void main(String[] args) {
		String registrationFile = "OriginalFile.csv";
		String sudamPuriFile = "SudampuriList.csv";
		
		try {
			ParivarMilanCsvMerger.merge(registrationFile, sudamPuriFile, "OriginalId", new String[]{"Pujari"}, "Merged.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void merge(String originalFilePath, String modifiedFilePath, String idColumn, String[] columnNamesToBeCopied, String outFile) throws Exception
	{
		// We have both files in array format now
		String[][] originalFile = CSVUtil.parseCSV(originalFilePath);
		String[][] modifiedFile = CSVUtil.parseCSV(modifiedFilePath);

		// Get the column index where idColumn occurs in the originalFile
		int originalFileKeyColumnIndex = ParivarMilanCsvMerger.GetColumnIndex(originalFile[0], idColumn);
		if (originalFileKeyColumnIndex == -1)
		{
			throw new Exception(idColumn + " not found in " + originalFilePath);
		}

		// Get the column index where idColumn occurs in the modifiedFile
		int modifiedFileKeyColumnIndex = ParivarMilanCsvMerger.GetColumnIndex(modifiedFile[0], idColumn);
		if (modifiedFileKeyColumnIndex == -1)
		{
			throw new Exception(idColumn + " not found in " + modifiedFilePath);
		}

		// Indexes of the columns in the modified file
		int[] columnIndicesToBeCopied = new int[columnNamesToBeCopied.length];
		ArrayList<String> columnNamesNotFound = new ArrayList<String>();

		// Find the index at which the columns occur
		for (int i = 0; i < columnNamesToBeCopied.length; ++i)
		{
			int columnIndex = ParivarMilanCsvMerger.GetColumnIndex(modifiedFile[0], columnNamesToBeCopied[i]);

			if (columnIndex == -1)
			{
				columnNamesNotFound.add(columnNamesToBeCopied[i]);
				continue;
			}
			columnIndicesToBeCopied[i] = columnIndex;
		}

		// If columnNamesNotFound's size is greater than 0, it means that the user specified column names
		// which do not exist in the modified file. We cannot proceed until this is resolved
		if (columnNamesNotFound.size() > 0)
		{
			for (String s : columnNamesNotFound)
			{
				System.out.println("Column " + s + " was not found in " + modifiedFilePath);
			}

			return;
		}
		
		// Compare the key columns in both the files and find the keys that don't match in each
		ArrayList<String> nonMatchingKeysInSourceFile = ParivarMilanCsvMerger.GetNonMatchingKeys(originalFile, originalFileKeyColumnIndex, modifiedFile, modifiedFileKeyColumnIndex);
		ArrayList<String> nonMatchingKeysInModifiedFile = ParivarMilanCsvMerger.GetNonMatchingKeys(modifiedFile, modifiedFileKeyColumnIndex, originalFile, originalFileKeyColumnIndex);
		
		if (nonMatchingKeysInSourceFile.size() > 0)
		{		
			System.out.println("Following keys were not found in the source file");
			
			for (String key : nonMatchingKeysInSourceFile)
			{
				System.out.println(key);
			}			
		}
		
		if (nonMatchingKeysInModifiedFile.size() > 0)
		{		
			System.out.println("Following keys were not found in the modified file");
			
			for (String key : nonMatchingKeysInModifiedFile)
			{
				System.out.println(key);
			}			
		}		
		
		CSVUtil.merge(originalFileKeyColumnIndex, originalFile, modifiedFileKeyColumnIndex, modifiedFile, columnIndicesToBeCopied, outFile);
	}
	
	// Find all strings that occur in referenceArray, but do not occur in newArray
	public static ArrayList<String> GetNonMatchingKeys(String[][] referenceArray, int referenceArrayKeyColumnIndex, String[][] newArray, int newArrayKeyColumnIndex)
	{
		ArrayList<String> nonMatchingStrings = new ArrayList<String>();
		
		boolean skip = true;
		
		for (String[] referenceRow : referenceArray)
		{
			if(skip)
			{
				skip = false;
				continue;
			}
			boolean matchFound = false;
			
			skip = true;
			
			for (String[] newRow : newArray)
			{
				if(skip) {
					skip = false;
					continue;
				}
				if (newRow[newArrayKeyColumnIndex].equals(referenceRow[referenceArrayKeyColumnIndex]))
				{
					// We have found a match
					matchFound = true;
				}
				
				if (!matchFound) nonMatchingStrings.add(referenceRow[referenceArrayKeyColumnIndex]);
			}
		}
		
		return nonMatchingStrings;
	}
	
	// Return the index in the array where the searchString is present
	// Return -1 if the string is not found
	public static int GetColumnIndex(String[] stringArray, String searchString)
	{
		for (int i = 0; i < stringArray.length; ++i)
		{
			if (stringArray[i].equals(searchString))
				return i;
		}

		return -1;
	}

	// Go through all rows in the given stringArray and find the row whose column at columnIndex matches the searchString
	public static int GetRowIndex(String[][] stringArray, int columnIndex, String searchString)
	{
		for (int i = 0; i < stringArray.length; ++i)
		{
			if (stringArray[i][columnIndex].equals(searchString))
			{
				return i;
			}
		}

		return -1;
	}	
	
	
}