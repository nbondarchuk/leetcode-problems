package arrays.MergeIntervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        int[] prev = intervals[0];
        List<int[]> merged = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (prev[1] >= current[0]) {
                prev[1] = current[1];
            } else {
                merged.add(prev);
                prev = current;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}
