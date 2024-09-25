package dp.ClimbingStairs_70;

class Solution2 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev = 2;
        int prePrev = 1;
        for (int i = 3; i < n; i++) {
            int current = prev + prePrev;
            prePrev = prev;
            prev = current;
        }

        return prev + prePrev;
    }
}
