package linkedlist.PalindromeLinkedList_234;

import linkedlist.ListNode;

import java.util.Stack;

/**
 * Space complexity O(n), time complexity O(n).
 * The algorithm makes 2 iterations over the list.
 * During the first iteration list content is stored into the stack.
 * During the second iteration stack is compared with the list.
 */
public class MyStackBasedSolution {

    public boolean isPalindrome(ListNode head) {
        ListNode iter = head;
        Stack<ListNode> stack = new Stack<>();
        while (iter != null) {
            stack.push(iter);
            iter = iter.next;
        }

        iter = head;
        while (iter != null) {
            if (stack.isEmpty()) {
                return false;
            }

            ListNode pop = stack.pop();
            if (pop.val != iter.val) {
                return false;
            }

            iter = iter.next;
        }

        return true;
    }
}
