package linkedlist.PalindromeLinkedList_234;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">Palindrome Linked List</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(new MyStackBasedSolution().isPalindrome(head));
        System.out.println(new Solution().isPalindrome(head));
    }
}
