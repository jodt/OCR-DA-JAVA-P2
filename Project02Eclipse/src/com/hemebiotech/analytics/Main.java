package com.hemebiotech.analytics;

public class Main {

    public static void main(String[] args) {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        analyticsCounter.readSymptoms();
        analyticsCounter.countSymptoms();
        analyticsCounter.writeSymtomsToFile();
    }
}
