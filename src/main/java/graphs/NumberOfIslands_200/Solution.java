package graphs.NumberOfIslands_200;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {

    private final Set<String> visited = new HashSet<>();

    private final int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(int[][] grid) {
        int count = 0;
        int nRows = grid.length;
        int nCols = grid[0].length;

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (grid[i][j] == 1 && !visited.contains(i + "," + j)) {
                    count++;
                    bfs(i, j, grid, nRows, nCols);
                }
            }
        }

        return count;
    }

    private void bfs(int row, int col, int[][] grid, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        visited.add(row + "," + col);
        queue.add(new int[]{row, col});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int r = point[0];
            int c = point[1];

            for (int i = 0; i < directions.length; i++) {
                int nr = r + directions[i][0];
                int nc = c + directions[i][1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1 && !visited.contains(nr + "," + nc)) {
                    visited.add(nr + "," + nc);
                    queue.add(new int[]{nr, nc});
                }
            }
        }
    }
}
