package math.PowerOfThree_326;

/**
 * See <a href="https://leetcode.com/problems/power-of-three/editorial/">Solution</a>
 */
class BaseConversionSolution {

    public boolean isPowerOfThree(int n) {
        String nBaseThree = Integer.toString(n, 3);
        return nBaseThree.matches("^10*$");
    }
}
