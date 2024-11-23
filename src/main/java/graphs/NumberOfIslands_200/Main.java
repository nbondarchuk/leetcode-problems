package graphs.NumberOfIslands_200;

class Main {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println(new Solution().numIslands(grid));
    }
}
