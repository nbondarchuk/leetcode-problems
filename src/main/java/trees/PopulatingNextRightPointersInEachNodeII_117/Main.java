package trees.PopulatingNextRightPointersInEachNodeII_117;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii">Populating Next Right Pointers in Each Node II</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        Node root = new Solution1().connect(makeTree());
        assertThat(root.next).isNull();
        assertThat(root.right.next).isNull();
        assertThat(root.left.next).isEqualTo(root.right);

        root = new Solution2().connect(makeTree());
        assertThat(root.next).isNull();
        assertThat(root.right.next).isNull();
        assertThat(root.left.next).isEqualTo(root.right);
    }

    private static Node makeTree() {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        root.left = left;
        root.right = right;

        return root;
    }
}
