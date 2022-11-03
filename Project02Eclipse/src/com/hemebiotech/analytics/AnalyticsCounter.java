package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Declare variables
		List<String> symptomsList;
		Map<String,Integer> symptomsMap;
		ReadSymptomDataFromFile readSymptomDataFromFile;
		ICountOcurrences countOcurrences;
		WriteSymptomDataToFile writeSymptomDataToFile;

		//Read symptoms from file
		readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		symptomsList = readSymptomDataFromFile.GetSymptoms();

		//Count symptoms occurrences
		countOcurrences = new CountSymptoms(symptomsList);
		symptomsMap = countOcurrences.countSymptoms();

		//enerate output
		writeSymptomDataToFile = new WriteSymptomDataToFile(symptomsMap);
		writeSymptomDataToFile.writeSymptoms();

	}
}
