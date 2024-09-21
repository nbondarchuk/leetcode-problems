package design.MinStack_155;

/**
 * <a href="https://leetcode.com/problems/min-stack/">Min Stack</a>
 */
public class Main {

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.push(3);
        System.out.println("Top: " + obj.top());
        System.out.println("Min: " + obj.getMin());
    }
}
