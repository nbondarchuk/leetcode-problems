package math.PowerOfThree_326;

/**
 * <a href="https://leetcode.com/problems/power-of-three/">Power of Three</a>
 * <br/>
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * <br/>
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new LoopIterationSolution().isPowerOfThree(27));
        System.out.println(new BaseConversionSolution().isPowerOfThree(27));
    }
}
