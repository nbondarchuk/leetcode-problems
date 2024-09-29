package math.HappyNumber_202;

class Solution {

    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int square(int n) {
        int ans = 0;
        while (n > 0) {
            int remainder = n % 10;
            ans += remainder * remainder;
            n = n / 10;
        }
        return ans;
    }
}
