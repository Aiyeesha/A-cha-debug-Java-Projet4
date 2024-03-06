package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 * 
 * Résumé du rôle de l'interface'. Write the result in a data output.
 *
 * @param symptoms the map containing the sorted symptoms and their count
 * @return
 */
public interface ISymptomCounter {

  public void writeSymptoms(Map<String, Integer> symptoms);

}
