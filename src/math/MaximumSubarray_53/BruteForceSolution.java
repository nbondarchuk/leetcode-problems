package math.MaximumSubarray_53;

class BruteForceSolution {

    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int localMax = Integer.MIN_VALUE;
            for (int j = i, localSum = 0; j < nums.length; j++) {
                localSum += nums[j];
                localMax = Math.max(localMax, localSum);
            }
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
