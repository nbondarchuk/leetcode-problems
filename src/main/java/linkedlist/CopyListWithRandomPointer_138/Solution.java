package linkedlist.CopyListWithRandomPointer_138;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node sentinel = new Node(0);
        Node prev = sentinel;
        while (head != null) {
            Node node = map.get(head);
            if (node == null) {
                node = new Node(head.val);
                map.put(head, node);
            }

            if (head.random != null) {
                if (map.get(head.random) != null) {
                    node.random = map.get(head.random);
                } else {
                    node.random = new Node(head.random.val);
                    map.put(head.random, node.random);
                }
            }

            prev.next = node;
            prev = node;

            head = head.next;
        }
        return sentinel.next;
    }
}
