package search.FirstBadVersion_278;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/">First Bad Version</a>
 * <p>
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * </p>
 * <p>
 * Constraints: 1 <= bad <= n <= 2^31 - 1
 * </p>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution(1).firstBadVersion(1));
    }
}
