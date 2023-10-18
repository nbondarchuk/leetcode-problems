package dp.ClimbingStairs_70;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int maxN;

    private final List<Integer> values = new ArrayList<>();

    public Solution() {
        maxN = 2;
        values.add(1);
        values.add(2);
    }

    public int climbStairs(int n) {
        if (n > maxN) {
            for (int i = maxN + 1; i <= n; i++) {
                values.add(get(i - 1) + get(i - 2));
            }
            maxN = n;
        }
        return get(n);
    }

    // n starts from 1, but list indexes are zero-based
    private int get(int n) {
        return values.get(n - 1);
    }
}
