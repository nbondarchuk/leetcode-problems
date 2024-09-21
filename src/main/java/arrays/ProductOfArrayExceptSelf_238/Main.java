package arrays.ProductOfArrayExceptSelf_238;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self"></a>
 */
class Main {

    public static void main(String[] args) {
        int[] res = new Solution().productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(res));
    }
}
