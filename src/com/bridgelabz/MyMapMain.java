package com.bridgelabz;

public class MyMapMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO HASHTABLE PROBLEMS");
            String sentence = "To be or not to be";
            HashTable<String, Integer> wordFreq = new HashTable<>();

            // Split the sentence into words
            String[] words = sentence.split(" ");

            // Count the frequency of each word
            for (String word : words) {
                Integer count = wordFreq.get(word);
                if (count == null) {
                    wordFreq.add(word, 1);
                } else {
                    wordFreq.add(word, count + 1);
                }
            }

            // Print the frequency of each word
            for (String word : words) {
                System.out.println(word + ": " + wordFreq.get(word));
            }
        }
    }

