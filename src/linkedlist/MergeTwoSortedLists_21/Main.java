package linkedlist.MergeTwoSortedLists_21;

import linkedlist.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists">Merge Two Sorted Lists</a>
 */
public class Main {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(new Solution().mergeTwoLists(list1, list2));
    }
}
