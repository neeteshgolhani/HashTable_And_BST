package com.bridgelabz;

import java.util.LinkedList;

public class HashTable<K, V> {
    private LinkedList<MyMapNode<K, V>>[] bucketArray;
    private int numBuckets;
    private int size;

    // Constructor
    public HashTable() {
        numBuckets = 10;
        bucketArray = new LinkedList[numBuckets];
        size = 0;

        // Initialize all buckets
        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    // Method to get the bucket index for a given key
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

    // Method to get the value for a given key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> list = bucketArray[bucketIndex];
        for (MyMapNode<K, V> node : list) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    // Method to add a key-value pair to the hash table
    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> list = bucketArray[bucketIndex];
        MyMapNode<K, V> node = new MyMapNode<>(key, value);
        boolean found = false;
        for (MyMapNode<K, V> existingNode : list) {
            if (existingNode.getKey().equals(key)) {
                existingNode.value = value;
                found = true;
                break;
            }
        }
        if (!found) {
            list.add(node);
            size++;
        }
    }

    // Method to remove a key-value pair from the hash table
    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> list = bucketArray[bucketIndex];
        for (MyMapNode<K, V> node : list) {
            if (node.getKey().equals(key)) {
                V value = node.getValue();
                list.remove(node);
                size--;
                return value;
            }
        }
        return null;
    }

    // Method to get the number of key-value pairs in the hash table
    public int size() {
        return size;
    }
}


