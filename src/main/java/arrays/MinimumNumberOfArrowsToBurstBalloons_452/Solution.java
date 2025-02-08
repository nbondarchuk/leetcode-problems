package arrays.MinimumNumberOfArrowsToBurstBalloons_452;

import common.Difficulty;

import java.util.Arrays;
import java.util.Comparator;

import static common.DifficultyLevel.MEDIUM;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons">Minimum Number of Arrows to Burst Balloons</a>
 */
@Difficulty(MEDIUM)
class Solution {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(x -> x[1]));

        int c = 1; // at least one arrow is required
        int prevEnd = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (prevEnd < points[i][0]) {
                c++;
                prevEnd = points[i][1];
            }
        }
        return c;
    }
}
