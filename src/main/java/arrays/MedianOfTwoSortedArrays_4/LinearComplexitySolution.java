package arrays.MedianOfTwoSortedArrays_4;

class LinearComplexitySolution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }

        if (nums.length % 2 == 0) {
            int idx = nums.length / 2;
            return (nums[idx - 1] + nums[idx]) / 2d;
        }
        return nums[nums.length / 2];
    }
}
