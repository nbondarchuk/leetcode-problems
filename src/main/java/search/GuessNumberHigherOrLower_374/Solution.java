package search.GuessNumberHigherOrLower_374;

class Solution {

    private final int num;

    Solution(int num) {
        this.num = num;
    }

    private int guess(int num) {
        return Integer.compare(this.num, num);
    }

    public int guessNumber(int n) {
        int number = -1;
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            int g = guess(mid);
            if (g == -1) {
                right = mid;
            } else if (g == 1) {
                left = mid + 1;
            } else {
                number = mid;
                break;
            }
        }
        return number;
    }
}
