package linkedlist.RotateList_61;

import linkedlist.ListNode;

class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int size = size(head);
        k = k % size;

        if (k == 0) {
            return head;
        }

        ListNode newTail = getNode(head, size - k);
        ListNode newHead = newTail.next;
        newTail.next = null;

        ListNode iter = newHead;
        while (iter.next != null) {
            iter = iter.next;
        }
        iter.next = head;
        return newHead;
    }

    private int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private ListNode getNode(ListNode head, int index) {
        int curr = 0;
        while (head != null) {
            curr++;
            if (curr == index) {
                break;
            }
            head = head.next;
        }
        return head;
    }
}
