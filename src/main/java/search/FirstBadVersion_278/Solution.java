package search.FirstBadVersion_278;

class Solution {

    private final int bad;

    public Solution(int bad) {
        this.bad = bad;
    }

    boolean isBadVersion(int version) {
        return version >= bad;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
