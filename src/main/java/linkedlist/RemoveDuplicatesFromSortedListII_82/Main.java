package linkedlist.RemoveDuplicatesFromSortedListII_82;

import common.Difficulty;
import linkedlist.ListNode;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii">Remove Duplicates from Sorted List II</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5))))))));

        ListNode actualResult = new Solution().deleteDuplicates(head);
        ListNode expectedResult = new ListNode(1, new ListNode(2, new ListNode(5)));
        assertThat(ListNode.equals(actualResult, expectedResult)).isTrue();
    }
}
