package com.bridgelabz;

public class MyMapMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO HASHTABLE PROBLEMS");
                String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
                String[] words = paragraph.split(" ");
                FrequencyCounter counter = new FrequencyCounter(words.length);

                // Count the frequency of each word in the paragraph
                for (String word : words) {
                    counter.addWord(word);
                }

                // Print the frequency of selected words
                System.out.println("Frequency of word 'paranoid': " + counter.getFrequency("paranoid"));
                System.out.println("Frequency of word 'avoidable': " + counter.getFrequency("avoidable"));
                System.out.println("Frequency of word 'situations': " + counter.getFrequency("situations"));
            }
        }
