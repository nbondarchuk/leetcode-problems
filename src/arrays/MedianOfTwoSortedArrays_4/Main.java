package arrays.MedianOfTwoSortedArrays_4;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 */
public class Main {

    public static void main(String[] args) {
//        double median = new LinearComplexitySolution().findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6});
//        double median2 = new LogarithmicComplexitySolution().findMedianSortedArrays2(new int[] {1, 2, 3}, new int[] {4, 5, 6});

        double median = new LinearComplexitySolution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2});
        double median2 = new LogarithmicComplexitySolution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2});
        System.out.println(median + " / " + median2);
    }
}
