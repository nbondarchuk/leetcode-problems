package linkedlist.DeleteNodeInALinkedList_237;

import linkedlist.ListNode;

class Solution {

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        if (next == null) {
            return;
        }
        node.val = next.val;
        node.next = next.next;
        next.next = null;
    }
}
