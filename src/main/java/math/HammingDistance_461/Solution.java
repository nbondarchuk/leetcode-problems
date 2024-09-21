package math.HammingDistance_461;

class Solution {

    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int num1Bits = 0;
        while (n != 0) {
            num1Bits++;
            n = n & n -1;
        }
        return num1Bits;
    }
}
