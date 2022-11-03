package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private Map<String, Integer> symptomsMap;

    public WriteSymptomDataToFile(Map<String, Integer> symptomsMap) {
        this.symptomsMap = symptomsMap;
    }

    @Override
    public void writeSymptoms() {
        /**
         * Reads symptoms from a map and save them in "result.out" file
         */
        try (FileWriter writer = new FileWriter("result.out")) {
            for (String symptom : symptomsMap.keySet()) {
                writer.write(symptom + "=" + symptomsMap.get(symptom) + "\n");
            }
        } catch (IOException e) {
            System.out.println("There is an error");
        }
    }
}
