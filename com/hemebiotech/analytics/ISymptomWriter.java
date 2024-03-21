package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Write the result in order in a data output.
 * @param symptoms the map containing the sorted symptoms and their count
 * @return
 */
public interface ISymptomWriter {

  public void writeSymptoms(Map<String, Integer> symptoms);

}