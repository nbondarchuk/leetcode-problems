package arrays.FindFirstAndLastPositionOfElementInSortedArray_34;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;

        int idx = findTarget(nums, target);
        if (idx > -1) {
            start = end = idx;
            while (start > 0 && nums[start - 1] == target) {
                start -= 1;
            }
            while (end < nums.length - 1 && nums[end + 1] == target) {
                end += 1;
            }
        }

        return new int[] {start, end};
    }

    private int findTarget(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
