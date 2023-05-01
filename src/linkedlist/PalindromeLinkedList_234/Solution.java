package linkedlist.PalindromeLinkedList_234;

import linkedlist.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode firstHalfEnd = halfSplit(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);

        boolean palindrome = true;
        ListNode h1Iter = head;
        ListNode h2Iter = secondHalfStart;
        while (palindrome && h2Iter != null) {
            palindrome = h1Iter.val == h2Iter.val;
            h1Iter = h1Iter.next;
            h2Iter = h2Iter.next;
        }

        // restore original list
        firstHalfEnd.next = reverse(secondHalfStart);

        return palindrome;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }

    private ListNode halfSplit(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
