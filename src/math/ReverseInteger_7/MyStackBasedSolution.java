package math.ReverseInteger_7;

import java.util.Stack;

public class MyStackBasedSolution {

    public int reverse(int x) {
        Stack<Integer> stack = new Stack<>();
        while (x != 0) {
            stack.push(x % 10);
            x = x / 10;
        }

        int pow = 0;
        int rev = 0;
        while (!stack.isEmpty()) {
            try {
                rev = Math.addExact(rev, (int) (stack.pop() * Math.pow(10, pow++)));
            } catch (ArithmeticException e) {
                return 0;
            }

//            int r = rev + (int) (stack.pop() * Math.pow(10, pow++));
//            if (rev != 0 && (r >> 31) != (rev >> 31)) {
//                return 0;
//            } else {
//                rev = r;
//            }
        }
        return rev;
    }
}
