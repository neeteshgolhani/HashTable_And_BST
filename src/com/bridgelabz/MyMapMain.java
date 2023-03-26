package com.bridgelabz;

public class MyMapMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO HASHTABLE PROBLEMS");
        String phrase = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = phrase.split(" ");
        HashTable table = new HashTable();
        for (String word : words) {
            if (!word.equals("avoidable")) {
                String existingValue = table.get(word);
                if (existingValue == null) {
                    table.add(word, "1");
                } else {
                    int count = Integer.parseInt(existingValue) + 1;
                    table.add(word, Integer.toString(count));
                }
            }
        }
        System.out.println(table.get("Paranoids")); // prints "2"
        System.out.println(table.get("avoidable")); // prints "null"
    }
}
