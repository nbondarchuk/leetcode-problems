package arrays.GasStation_134;

import java.util.stream.IntStream;

class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = IntStream.of(gas).sum();
        int totalCost = IntStream.of(cost).sum();

        if (totalCost > totalGas) {
            return -1;
        }

        int currentGas = 0;
        int currentIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] -= cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                currentIndex = i + 1;
            }
        }
        return currentIndex;
    }
}
