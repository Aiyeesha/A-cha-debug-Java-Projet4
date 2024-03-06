package com.hemebiotech.analytics;

public class SymptomsCounter<symptoms> {

    private List<symptoms> symptoms;

    public SymptomsCounter(List<symptoms> symptoms) {
        this.symptoms = symptoms;
    }

    public Map<symptoms, Integer> countSymptoms() {
        Map<Symptom, Integer> occurrences = new HashMap<>();

        for (Symptom symptom : symptoms.txt) {
            if (occurrences.containsKey(symptom)) {
                int count = occurrences.get(symptom);
                occurrences.put(symptom, count + 1);
            } else {
                occurrences.put(symptom, 1);
            }
        }
    }
}