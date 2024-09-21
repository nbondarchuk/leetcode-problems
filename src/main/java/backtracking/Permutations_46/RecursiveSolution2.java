package backtracking.Permutations_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RecursiveSolution2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,nums,  new int[nums.length], 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int[] a, int lvl) {
        if (lvl == a.length) {
            result.add(Arrays.stream(a).boxed().toList());
        } else {
            for (int i = 0; i < nums.length; i++) {
                boolean used = false;
                for (int j = 0; j < lvl; j++) {
                    if (a[j] == nums[i]) {
                        used = true;
                        break;
                    }
                }
                if (!used) {
                    a[lvl] = nums[i];
                    backtrack(result, nums, a, lvl + 1);
                }
            }
        }
    }
}
