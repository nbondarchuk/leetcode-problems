package arrays.SearchInRotatedSortedArray_33;

/**
 * See <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/154836/The-INF-and-INF-method-but-with-a-better-explanation-for-dummies-like-me/">explanation</a>.
 */
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int comparator;
            int mid = left + (right - left) / 2;
            // check if target and nums[mid] are on the same side
            if ((target < nums[0] && nums[mid] < nums[0]) || (target >= nums[0] && nums[mid] >= nums[0])) {
                comparator = nums[mid];
            } else {
                if (target < nums[0]) {
                    comparator = Integer.MIN_VALUE;
                } else {
                    comparator = Integer.MAX_VALUE;
                }
            }
            if (target == comparator) {
                return mid;
            }
            if (target > comparator) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
