package de.exxcellent.challenge;

import java.io.*;
import java.util.*;

public class ReadIn {
	
	/**
	 * Reads in a file
	 * @param file the name of the file to read
	 * @return a List which contains the rows which contains the collumns as an Array
	 * @throws Exception FileNotFoundException and IOException
	 */
	public  static ArrayList<String[]> readData(String file) throws Exception  { 
	    ArrayList<String[]> csv = new ArrayList<>();		 
	    FileReader fr = new FileReader("main\\resources\\de\\exxcellent\\challenge\\"+file);
	    BufferedReader br = new BufferedReader(fr);
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            csv.add(line.split("\\s*,\\s*"));
	        }
	    return csv;
	}
}
