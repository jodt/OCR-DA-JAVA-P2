package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	private List<String> symptomsList;
	private Map<String,Integer> symptomsMap;
	private ReadSymptomDataFromFile readSymptomDataFromFile;
	private ICountOcurrences countOcurrences;

	private WriteSymptomDataToFile writeSymptomDataToFile;

	public void readSymptoms(){
		readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		symptomsList = readSymptomDataFromFile.GetSymptoms();
	}

	public void countSymptoms(){
		countOcurrences = new CountSymptoms(symptomsList);
		symptomsMap = countOcurrences.countSymptoms();
	}

	public void writeSymtomsToFile(){
		writeSymptomDataToFile = new WriteSymptomDataToFile(symptomsMap);
		writeSymptomDataToFile.writeSymptoms();
	}

}
