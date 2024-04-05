package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;



public class Main {
	/**
	 * Run the program
	 *@param args
	 *@throws IOException
	 */

	    public static void main(String[] args) throws IOException {

	        /*
	        Read symptoms.txt and return list
	         */
	    	ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile(new File("Project04Eclipse/Ressources/Symptoms.txt"));
	        List<String> symptoms = readSymptomDataFromFile.getSymptoms();

	        /*
	        Sorts in alphabetical order and counts the occurrences of the symptoms in the list
	         */
	        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
	        Map<String, Integer> countSymptoms = analyticsCounter.countSymptoms(symptoms);

	        /*
	        Print result in the results.out file
	         */
	        File fileOut = new File("Results.out");
	        analyticsCounter.writeResults(countSymptoms, fileOut);


	}

}


