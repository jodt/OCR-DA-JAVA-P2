package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Implement method to count symptoms.
 *
 * Returns a map with symptoms sorted alphabetically or an empty map
 */

public class CountSymptoms implements ICountOcurrences {

    private List<String> symptomsList;

    /**
     *
     * @param symptomsList list of symptoms that may contain many duplications
     */
    public CountSymptoms(List<String> symptomsList) {
        this.symptomsList = symptomsList;
    }

    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String,Integer> symptomsOrderedMap = new TreeMap<>();
        for (String symptom : symptomsList){
            if (!symptomsOrderedMap.containsKey(symptom)){
                symptomsOrderedMap.put(symptom,1);
            } else {
                symptomsOrderedMap.put(symptom,symptomsOrderedMap.get(symptom)+1);
            }
        }
        return symptomsOrderedMap;
    }
}
