package arrays.ProductOfArrayExceptSelf_238;

import java.util.Arrays;

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i];
        }
        System.out.println(Arrays.toString(prefixProduct));

        int[] suffixProduct = new int[nums.length];
        suffixProduct[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i+1] * nums[i];
        }
        System.out.println(Arrays.toString(suffixProduct));

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prefix = i - 1 >= 0 ? prefixProduct[i-1] : 1;
            int suffix = i + 1 <= nums.length-1 ? suffixProduct[i+1] : 1;
            result[i] = prefix * suffix;
        }
        return result;
    }
}
