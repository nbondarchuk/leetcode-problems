package math.ReverseBits_190;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/">Reverse Bits</a>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(new Solution().reverseBits(0b00000010100101000001111010011100)));
        System.out.println(Integer.toBinaryString(new Solution().reverseBits(0b11111111111111111111111111111101)));
    }
}
