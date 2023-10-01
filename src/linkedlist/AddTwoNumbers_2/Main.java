package linkedlist.AddTwoNumbers_2;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1));
        ListNode l2 = new ListNode(1, new ListNode(9));
        System.out.println(new Solution().addTwoNumbers(l1, l2));
    }
}
