package math.MissingNumber_268;

/**
 * <a href="https://leetcode.com/problems/missing-number/">Missing Number</a>
 * <p>
 *     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{3,0,1}));
        System.out.println(new Solution().missingNumber(new int[]{0,1}));
        System.out.println(new Solution().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
