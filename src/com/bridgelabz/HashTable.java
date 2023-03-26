package com.bridgelabz;
import java.util.LinkedList;
public class HashTable {
    private LinkedList<MyMapNode>[] bucketArray;
    private int numBuckets;

    public HashTable() {
        this.numBuckets = 10;
        this.bucketArray = new LinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.bucketArray[i] = null;
        }
    }

    // method to get the index of the bucket based on the key
    private int getBucketIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        if (index < 0) {
            index += numBuckets;
        }
        return index;
    }
    // method to add a key-value pair to the hash table
    public void add(String key, String value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode> list = bucketArray[bucketIndex];
        if (list == null) {
            list = new LinkedList<>();
            bucketArray[bucketIndex] = list;
        }
        MyMapNode node = new MyMapNode(key, value);
        list.add(node);
    }

    // method to remove a key-value pair from the hash table
    public void remove(String key, String value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode> list = bucketArray[bucketIndex];
        if (list == null) {
            return;
        }
        for (MyMapNode node : list) {
            if (node.key.equals(key) && node.value.equals(value)) {
                list.remove(node);
                break;
            }
        }
    }

    // method to search for a value based on a key
    public String get(String key) {
        int bucketIndex = getBucketIndex(key);
        if (bucketIndex < 0) {
            return null;
        }
        LinkedList<MyMapNode> list = bucketArray[bucketIndex];
        if (list == null) {
            return null;
        }
        for (MyMapNode node : list) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }
}
