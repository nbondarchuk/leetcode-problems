package math.NumberOf1Bits_191;

class Solution {

    /**
     * n         | 1 1 1 0 1 0 0 0
     * ---------------------------
     * n - 1     | 1 1 1 0 0 1 1 1
     * ---------------------------
     * n & n - 1 | 1 1 1 0 0 0 0 0
     */
    public int hammingWeight(int n) {
        int num1Bits = 0;
        while (n != 0) {
            num1Bits = num1Bits + (n & 1);
            n = n >>> 1;
        }
        return num1Bits;


//        int num1Bits = 0;
//        while (n != 0) {
//            num1Bits++;
//            n = n & n -1;
//        }
//        return num1Bits;
    }
}
