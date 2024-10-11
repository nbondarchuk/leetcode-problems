package bits.SingleNumberII_137;

class Solution {

    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num: nums) {
                sum += (num >>> i) & 1;
            }
            sum %= 3;
            n |= sum << i;
        }
        return n;
    }
}