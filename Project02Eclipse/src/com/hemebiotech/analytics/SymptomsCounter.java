package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomsCounter<symptoms> {

    private List<symptoms> symptoms;

    public SymptomsCounter(List<symptoms> symptoms) {
        this.symptoms = symptoms;
    }

    public Map<symptoms, Integer> countSymptoms() {
        Map<symptoms, Integer> occurrences = new HashMap<>();

        for (symptoms symptom : symptoms) {
            if (occurrences.containsKey(symptom)) {
                int count = occurrences.get(symptom);
                occurrences.put(symptom, count + 1);
            } else {
                occurrences.put(symptom, 1);
            }
        }
		return occurrences  ;
    }
}