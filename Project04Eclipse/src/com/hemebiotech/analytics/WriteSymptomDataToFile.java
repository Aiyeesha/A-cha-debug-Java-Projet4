package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple implementation writing in a file.
 * @param ISymptomReader implémente l'interface
 * @return
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

  /**
   * Write the result in the Result.out file.
   * @param symptoms the map containing the sorted symptoms and their count
   * @return
   */
  @Override
public void writeSymptoms(Map<String, Integer> symptoms) {
    try (FileWriter writer = new FileWriter(new File("Results.out"))) {
      for (String symptom : symptoms.keySet()) {
        writer.write(symptom + " : " + symptoms.get(symptom) + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
