package math.FizzBuzzMultithreaded_1195;

import java.util.function.IntConsumer;

class FizzBuzz {

    private final int n;

    private volatile int c = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) {
        while (c <= n) {
            synchronized (this) {
                if (c <= n) {
                    if (c % 3 == 0 && c % 5 != 0) {
                        printFizz.run();
                        c++;
                    }
                }
            }
            Thread.yield();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) {
        while (c <= n) {
            synchronized (this) {
                if (c <= n) {
                    if (c % 3 != 0 && c % 5 == 0) {
                        printBuzz.run();
                        c++;
                    }
                }
            }
            Thread.yield();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) {
        while (c <= n) {
            synchronized (this) {
                if (c <= n) {
                    if (c % 3 == 0 && c % 5 == 0) {
                        printFizzBuzz.run();
                        c++;
                    }
                }
            }
            Thread.yield();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) {
        while (c <= n) {
            synchronized (this) {
                if (c <= n) {
                    if (c % 3 != 0 && c % 5 != 0) {
                        printNumber.accept(c);
                        c++;
                    }
                }
            }
            Thread.yield();
        }
    }
}