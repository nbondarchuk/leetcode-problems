package backtracking.NQueensII_52;

import common.Difficulty;
import common.Topics;

import java.util.HashSet;
import java.util.Set;

import static common.DifficultyLevel.HARD;
import static common.Topic.BACKTRACKING;

/**
 * <a href="https://leetcode.com/problems/n-queens-ii">N-Queens II</a>
 */
@Difficulty(HARD)
@Topics(BACKTRACKING)
class Solution {

    public int totalNQueens(int n) {
        return backtrack(n, n, new HashSet<>(), new HashSet<>(), new HashSet<>());
    }

    private int backtrack(int n, int row, Set<Integer> cols, Set<Integer> diagonals, Set<Integer> antiDiagonals) {
        if (row == 0) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {
            int diagonal = row + col;
            int antiDiagonal = row - col;

            if (!cols.contains(col) && !diagonals.contains(diagonal) && !antiDiagonals.contains(antiDiagonal)) {
                cols.add(col);
                diagonals.add(diagonal);
                antiDiagonals.add(antiDiagonal);

                count += backtrack(n, row - 1, cols, diagonals, antiDiagonals);

                cols.remove(col);
                diagonals.remove(diagonal);
                antiDiagonals.remove(antiDiagonal);
            }
        }

        return count;
    }
}
