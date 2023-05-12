package math.MaximumSubarray_53;

/**
 * <a href="https://habr.com/ru/articles/539166/">Удивительно быстрые алгоритмы</a>
 * <a href="https://math4everyone.info/blog/2020/12/29/poisk-maksimalnoj-summy-posledovatelnyh-elementov-massiva-algoritm-kadane-dinamicheskoe-programmirovanie/">Алгоритм Кадане</a>
 */
class Solution {

    public int maxSubArray(int[] nums) {
        int localSum = 0;
        int globalSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            localSum = Math.max(nums[i], localSum + nums[i]);
            globalSum = Math.max(localSum, globalSum);
        }
        return globalSum;
    }
}
