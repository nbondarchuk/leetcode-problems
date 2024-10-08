package linkedlist.LRUCache_146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private static class Node {

        private int key;

        private int val;

        private Node next;

        private Node prev;
    }

    private final Node head;

    private final Node tail;

    private final int capacity;

    private final Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node keyNode = map.get(key);

            keyNode.prev.next = keyNode.next;
            keyNode.next.prev = keyNode.prev;

            addFirst(keyNode);

            return keyNode.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node keyNode = map.get(key);
            keyNode.val = value;

            keyNode.prev.next = keyNode.next;
            keyNode.next.prev = keyNode.prev;

            addFirst(keyNode);
        } else {
            Node keyNode = new Node();
            keyNode.key = key;
            keyNode.val = value;

            addFirst(keyNode);
            map.put(key, keyNode);

            if (map.size() > capacity) {
                Node toRemove = map.remove(tail.prev.key);

                toRemove.prev.next = tail;
                tail.prev = toRemove.prev;
            }
        }
    }

    private void addFirst(Node node) {
        node.prev = head;
        node.next = head.next;
        node.next.prev = node;
        node.prev.next = node;
    }
}
