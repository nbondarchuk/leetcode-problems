package linkedlist.CopyListWithRandomPointer_138;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/copy-list-with-random-pointer">Copy List with Random Pointer</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        Node node2 = new Node(2);
        node2.random = node2;

        Node node1 = new Node(1);
        node1.next = node2;
        node1.random = node2;

        Node node1Copy = new Solution().copyRandomList(node1);

        assertThat(node1Copy.val).isEqualTo(1);
        assertThat(node1Copy.next).isNotNull();

        Node node2Copy = node1Copy.next;
        assertThat(node2Copy.val).isEqualTo(2);
        assertThat(node2Copy.next).isNull();
        assertThat(node2Copy.random).isEqualTo(node2Copy);

        assertThat(node1Copy.next).isEqualTo(node2Copy);
        assertThat(node1Copy.random).isEqualTo(node2Copy);
    }
}
