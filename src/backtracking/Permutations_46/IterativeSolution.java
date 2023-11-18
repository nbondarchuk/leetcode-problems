package backtracking.Permutations_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IterativeSolution {

    /**
     * Time complexity O(n*n!).
     */
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.stream(nums).boxed().toList());

        if (nums.length == 1) {
            return result;
        }

        while (true) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] > nums[i + 1]) {
                i--;
            }

            if (i < 0) {
                return result;
            }

            int j = i;
            while (j < nums.length - 1 && nums[j + 1] > nums[i]) {
                j++;
            }

            swap(nums, i, j);

            for (int m = i + 1, n = nums.length - 1; m < n; m++, n--) {
                swap(nums, m, n);
            }

            result.add(Arrays.stream(nums).boxed().toList());
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
