package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will count symptom occurrences from a source
 */

public interface ICountOcurrences {
    /**
     *
     * @return a map that contains the name of the symptom as key and its number of occurrences as value
     */
    Map<String,Integer> countSymptoms();
}
