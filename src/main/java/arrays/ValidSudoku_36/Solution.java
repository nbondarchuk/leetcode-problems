package arrays.ValidSudoku_36;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean isValidSudoku(char[][] board) {
        // validate rows
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!set.add(c)) {
                        return false;
                    }
                }
            }
        }

        // validate columns
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (!set.add(c)) {
                        return false;
                    }
                }
            }
        }

        // validate 3 x 3 sub-boxes
        Set<Character>[][] sets = new Set[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int row = i / 3;
                int col = j / 3;
                if (sets[row][col] == null) {
                    sets[row][col] = new HashSet<>();
                }

                char c = board[i][j];
                if (c != '.') {
                    if (!sets[row][col].add(c)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
