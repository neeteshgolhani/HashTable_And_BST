package com.bridgelabz;
public class MyMapNode<K, V> {
    K key;
    V value;

    // Constructor
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter methods
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
