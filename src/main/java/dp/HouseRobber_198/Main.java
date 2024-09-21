package dp.HouseRobber_198;

/**
 * <a href="https://leetcode.com/problems/house-robber/description/">House Robber</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new RecursiveWithMemoSolution().rob(new int[] {1,2,3,1}));
        System.out.println(new RecursiveWithMemoSolution().rob(new int[] {2,7,9,3,1}));

        System.out.println("---");

        System.out.println(new IterativeSolution().rob(new int[] {1,2,3,1}));
        System.out.println(new IterativeSolution().rob(new int[] {2,7,9,3,1}));

        System.out.println("---");

        System.out.println(new IterativeSolutionWithConstantMemoryUsage().rob(new int[] {1,2,3,1}));
        System.out.println(new IterativeSolutionWithConstantMemoryUsage().rob(new int[] {2,7,9,3,1}));
    }
}
