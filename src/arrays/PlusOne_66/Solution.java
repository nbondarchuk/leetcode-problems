package arrays.PlusOne_66;

public class Solution {

    public int[] plusOne(int[] digits) {
        boolean add = true;
        for (int i = digits.length - 1; i >= 0 && add; i--) {
            int num = digits[i] + 1;
            if (num >= 10) {
                digits[i] = 0;
            } else {
                add = false;
                digits[i] = num;
            }
        }
        if (add) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return digits;
    }
}
