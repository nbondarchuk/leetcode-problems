package linkedlist.LinkedListCycle_141;

import common.Difficulty;
import linkedlist.ListNode;

import static common.DifficultyLevel.EASY;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle">Linked List Cycle</a>
 */
@Difficulty(EASY)
class Main {

    public static void main(String[] args) {
        ListNode last = new ListNode(-4);
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, last)));
        last.next = head;

        assertThat(new Solution().hasCycle(head)).isTrue();
    }
}
