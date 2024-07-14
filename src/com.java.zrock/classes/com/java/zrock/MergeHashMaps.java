package com.java.zrock;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ALICIA TAU
 */
public class MergeHashMaps {
    public Map<String, Integer> mergeHashMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>();
        
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            merged.put(key, value);
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (merged.containsKey(key)) {
                int newValue = merged.get(key) + value;
                merged.put(key, newValue);
            } else {
                merged.put(key, value);
            }
        }

        return merged;
    }
}
