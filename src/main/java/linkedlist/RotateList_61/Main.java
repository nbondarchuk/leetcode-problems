package linkedlist.RotateList_61;

import common.Difficulty;
import linkedlist.ListNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/rotate-list">Rotate List</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode actualResult = new Solution().rotateRight(head, 2);
        ListNode expectedResult = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3)))));
        assertThat(ListNode.equals(actualResult, expectedResult)).isTrue();
    }
}
