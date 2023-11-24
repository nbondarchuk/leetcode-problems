package trees.AddOneRowToTree_623;

import common.Difficulty;
import common.Topics;
import trees.TreeNode;

import static common.DifficultyLevel.MEDIUM;
import static common.Topic.*;

@Topics({
        DFS,
        BFS,
        TREE,
        BINARY_TREE
})
@Difficulty(MEDIUM)
public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), null);
        System.out.println(new Solution().addOneRow(root, 1, 3));
    }
}
