package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private Map<String, Integer> symptomsMap;
    private String filepath;

    public WriteSymptomDataToFile(Map<String, Integer> symptomsMap, String filepath) {
        this.symptomsMap = symptomsMap;
        this.filepath = filepath;
    }

    /**
     * Reads symptoms from a map and save them in a file
     */
    @Override
    public void writeSymptoms() {

        try (FileWriter writer = new FileWriter(filepath)) {
            for (String symptom : symptomsMap.keySet()) {
                writer.write(symptom + "=" + symptomsMap.get(symptom) + "\n");
            }
        } catch (IOException e) {
            System.out.println("There is an error");
        }
    }
}
