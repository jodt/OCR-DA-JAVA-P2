/**
 * The Analyticscounter class allows to chain the functions of reading,
 * counting and writing in an output file, symptoms coming from a source file
 *
 */
package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Represents an analytics counter
 * @author Joel Dumortier
 */
public class AnalyticsCounter {

	private List<String> symptomsList;
	private Map<String,Integer> symptomsMap;
	private ISymptomReader readSymptomDataFromFile;
	private ICountOcurrences countOcurrences;
	private ISymptomWriter writeSymptomDataToFile;


	/**
	 * Read, count and write to a file symptoms coming from a source
	 */
	public void analyticsCounterStart(){
		this.readSymptoms();
		this.countSymptoms();
		this.writeSymtomsToFile();
	}

	/**
	 * Read symptoms from a file called symptoms.txt and put them into a list.
	 */
	private void readSymptoms(){
		readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		symptomsList = readSymptomDataFromFile.GetSymptoms();
	}

	/**
	 * Count the symptoms from a list and create a map, with each symptom and its number of occurrences
	 */
	private void countSymptoms(){
		countOcurrences = new CountSymptoms(symptomsList);
		symptomsMap = countOcurrences.countSymptoms();
	}

	/**
	 * Write each symptom and its occurrence count to a file called result.out
	 */
	private void writeSymtomsToFile(){
		writeSymptomDataToFile = new WriteSymptomDataToFile(symptomsMap, "result.out");
		writeSymptomDataToFile.writeSymptoms();
	}
}
