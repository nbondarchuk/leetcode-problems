package arrays.Permutations_46;

/**
 * <a href="https://leetcode.com/problems/permutations">Permutations</a>
 * <p>
 * Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new IterativeSolution().permute(new int[]{1, 2, 3}));
        System.out.println(new RecursiveSolution1().permute(new int[]{1, 2, 3}));
        System.out.println(new RecursiveSolution2().permute(new int[]{1, 2, 3}));
    }
}