package com.bridgelabz;
import java.util.LinkedList;`
public class FrequencyCounter {
    private LinkedList<MyMapNode>[] hashTable;
    private int size;

    public FrequencyCounter(int size) {
        this.size = size;
        hashTable = new LinkedList[size];
    }

    private int getHashCode(String word) {
        int hashCode = 0;
        for (char c : word.toCharArray()) {
            hashCode += c;
        }
        return hashCode % size;
    }

    public void addWord(String word) {
        int index = getHashCode(word);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<MyMapNode>();
            hashTable[index].add(new MyMapNode(word, 1));
        } else {
            boolean wordExists = false;
            for (MyMapNode node : hashTable[index]) {
                if (node.key.equals(word)) {
                    node.value++;
                    wordExists = true;
                    break;
                }
            }
            if (!wordExists) {
                hashTable[index].add(new MyMapNode(word, 1));
            }
        }
    }

    public int getFrequency(String word) {
        int index = getHashCode(word);
        if (hashTable[index] != null) {
            for (MyMapNode node : hashTable[index]) {
                if (node.key.equals(word)) {
                    return node.value;
                }
            }
        }
        return 0;
    }
}
