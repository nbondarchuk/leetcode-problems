package math.MaximumSubarray_53;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/">Maximum Subarray</a>
 * <p>
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution().maxSubArray(nums));
        System.out.println(new BruteForceSolution().maxSubArray(nums));
    }
}
