package math.PowerOfThree_326;

/**
 * See <a href="https://leetcode.com/problems/power-of-three/editorial/">Solution</a>
 */
public class LoopIterationSolution {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
