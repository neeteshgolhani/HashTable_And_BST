package com.bridgelabz;
import java.util.LinkedList;

    public class MyMapNode {
        String key;
        String value;
        LinkedList<MyMapNode> next;
        public MyMapNode(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = new LinkedList<>();
        }
    }