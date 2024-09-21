package math.ReverseBits_190;

class Solution {

    public int reverseBits(int n) {
        int c = 32;
        int rev = 0;
        while (c > 0) {
            rev <<= 1;
            if ((n & 1) == 1) {
                rev ^= 1;
            }
            n >>>= 1;
            c--;
        }
        return rev;
    }
}
