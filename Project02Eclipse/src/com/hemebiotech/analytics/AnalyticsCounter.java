package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Analyticscounter class allows to chain the functions of reading,
 * counting and writing in an output file, symptoms coming from a source file
 *
 */
public class AnalyticsCounter {

	private List<String> symptomsList;
	private Map<String,Integer> symptomsMap;
	private ISymptomReader readSymptomDataFromFile;
	private ICountOcurrences countOcurrences;
	private ISymptomWriter writeSymptomDataToFile;

	private void readSymptoms(){
		readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		symptomsList = readSymptomDataFromFile.GetSymptoms();
	}

	private void countSymptoms(){
		countOcurrences = new CountSymptoms(symptomsList);
		symptomsMap = countOcurrences.countSymptoms();
	}

	private void writeSymtomsToFile(){
		writeSymptomDataToFile = new WriteSymptomDataToFile(symptomsMap);
		writeSymptomDataToFile.writeSymptoms();
	}

	/**
	 * Read, count and write to a file symptoms coming from a source file
	 */
	public void analyticsCounterStart(){
		this.readSymptoms();
		this.countSymptoms();
		this.writeSymtomsToFile();

	}
}
