package linkedlist.ReverseNodesInKGroup_25;

import common.Difficulty;
import linkedlist.ListNode;

import static common.DifficultyLevel.HARD;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group">Reverse Nodes in k-Group</a>
 */
@Difficulty(HARD)
class Main {

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))));
        assertThat(ListNode.equals(new Solution().reverseKGroup(list, 2), expected)).isTrue();
    }
}
