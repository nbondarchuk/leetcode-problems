package linkedlist.ReverseLinkedListII_92;

import common.Difficulty;
import linkedlist.ListNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list-ii">Reverse Linked List II</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        ListNode original = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode actualReversed = new Solution().reverseBetween(original, 2, 4);
        ListNode expectedReversed = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));

        assertThat(ListNode.equals(actualReversed, expectedReversed)).isTrue();
    }
}
