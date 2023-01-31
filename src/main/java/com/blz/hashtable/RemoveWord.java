package com.blz.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RemoveWord {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations.";
        String wordToRemove = "avoidable";
        String[] words = paragraph.split("\\s+");

        StringBuilder modifiedParagraph = new StringBuilder();

        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                modifiedParagraph.append(word).append(" ");
            }
        }
        System.out.println(modifiedParagraph.toString().trim());
    }
}

