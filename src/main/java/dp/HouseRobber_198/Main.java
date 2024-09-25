package dp.HouseRobber_198;

/**
 * <a href="https://leetcode.com/problems/house-robber/description/">House Robber</a>
 */
class Main {

    public static void main(String[] args) {
        System.out.println(new RecursiveWithMemoSolution().rob(new int[]{1, 2, 3, 1}));
        System.out.println(new RecursiveWithMemoSolution().rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(new RecursiveWithMemoSolution().rob(new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240}));

        System.out.println("---");

        System.out.println(new IterativeSolution().rob(new int[]{1, 2, 3, 1}));
        System.out.println(new IterativeSolution().rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(new IterativeSolution().rob(new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240}));

        System.out.println("---");

        System.out.println(new IterativeSolutionWithConstantMemoryUsage().rob(new int[]{1, 2, 3, 1}));
        System.out.println(new IterativeSolutionWithConstantMemoryUsage().rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(new IterativeSolutionWithConstantMemoryUsage().rob(new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240}));
    }
}
