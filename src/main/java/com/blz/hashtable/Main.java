package com.blz.hashtable;

class MyMapNode {
    String key;
    int value;
    MyMapNode next;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyMap {
    MyMapNode head;

    public MyMap() {
        this.head = null;
    }

    public void put(String key, int value) {
        MyMapNode newNode = new MyMapNode(key, value);
        newNode.next = head;
        head = newNode;
    }

    public int get(String key) {
        MyMapNode current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }
}

    public class Main {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");
        MyMap map = new MyMap();
        for (String word : words) {
            int count = map.get(word);
            map.put(word, count + 1);
        }
        for (String word : words) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}
