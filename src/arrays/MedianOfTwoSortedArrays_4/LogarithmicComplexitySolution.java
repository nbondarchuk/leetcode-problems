package arrays.MedianOfTwoSortedArrays_4;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/2471/very-concise-o-log-min-m-n-iterative-solution-with-detailed-explanation/">Solution description</a>
 */
public class LogarithmicComplexitySolution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // We would like nums1 to be not shorter than nums2.
        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int lo = 0, hi = nums2Length * 2;
        while (lo <= hi) {
            int cut2 = (lo + hi) / 2;
            int cut1 = nums1Length + nums2Length - cut2;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[(cut1 - 1) / 2];
            int r1 = cut1 == nums1Length * 2 ? Integer.MAX_VALUE : nums1[cut1 / 2];

            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[(cut2 - 1) / 2];
            int r2 = cut2 == nums2Length * 2 ? Integer.MAX_VALUE : nums2[cut2 / 2];

            // our goal is l1 <= r1 && l1 <= r2 && l2 <= r1 && l2 <= r2
            if (l1 > r2) {
                lo = cut2 + 1; // nums1's lower half is too big; need to move C1 left (C2 right)
            } else if (l2 > r1) {
                hi = cut2 - 1; // nums2's lower half too big; need to move C2 left (C1 right)
            } else {
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2d;
            }
        }

        return -1;
    }
}
