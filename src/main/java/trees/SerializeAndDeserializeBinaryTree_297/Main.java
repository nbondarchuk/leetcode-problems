package trees.SerializeAndDeserializeBinaryTree_297;

import common.Difficulty;
import common.Topics;
import trees.TreeNode;

import static common.DifficultyLevel.HARD;
import static common.Topic.*;

/**
 * <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree">Serialize and Deserialize Binary Tree</a>
 */
@Topics({
        DFS,
        BFS,
        TREE,
        STRING,
        BINARY_TREE
})
@Difficulty(HARD)
public class Main {

    public static void main(String[] args) {
        TreeNode tree = new Codec().deserialize("[1, 2, 3, null, 4]");
        System.out.println(new Codec().serialize(tree));
    }
}
