package io.github.vaijyant;

/**
 * Former Coding Interview Question:
 * Find longest word in dictionary that is a subsequence of a given string
 */

public class LongestWord {
    String[] dictionary;
    String string;

    LongestWord(String[] dictionary, String string) {
        this.dictionary = dictionary;
        this.string = string;
    }

    void identifySubSequence() {
        String identifiedWord = "";

        for (String word : dictionary) {

            if (word.length() > identifiedWord.length()) {
                int positionInWord = 0;

                for (int i = 0; i < string.length(); i++) {
                    if (positionInWord == word.length()) {
                        identifiedWord = word;
                        break;// Break and process next word
                    }
                    if (string.charAt(i) == word.charAt(positionInWord)) {
                        positionInWord++;
                    }
                }
            }
        }
        System.out.println("The word identified is: " + identifiedWord);
    }
}
