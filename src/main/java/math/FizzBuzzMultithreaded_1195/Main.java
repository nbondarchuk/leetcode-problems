package math.FizzBuzzMultithreaded_1195;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz-multithreaded/">Fizz Buzz Multithreaded</a>
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        FizzBuzz data = new FizzBuzz(15);
        List<String> output = Collections.synchronizedList(new ArrayList<>());
        Thread thread1 = new Thread(() -> {
            try {
                data.fizz(() -> output.add("fizz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                data.buzz(() -> output.add("buzz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thread3 = new Thread(() -> {
            try {
                data.fizzbuzz(() -> output.add("fizzbuzz"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thread4 = new Thread(() -> {
            try {
                data.number(num -> output.add(String.valueOf(num)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(output);
    }
}
