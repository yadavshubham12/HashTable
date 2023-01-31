package com.blz.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";
        Map<String, Integer> frequencyMap = new HashMap<>();

        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            Integer count = frequencyMap.get(word);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

