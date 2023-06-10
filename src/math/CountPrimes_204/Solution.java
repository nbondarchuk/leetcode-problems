package math.CountPrimes_204;

/**
 * See <a href="https://ru.wikipedia.org/wiki/Решето_Эратосфена">Sieve of Eratosthenes</a>
 */
class Solution {

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

//        for (int i = 2; i * i < n; i++) {
//            if (primes[i]) {
//                for (int j = i * i; j < n; j = j + i) {
//                    primes[j] = false;
//                }
//            }
//        }

        for (int i = 2; 2 * i < n; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : primes) {
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
