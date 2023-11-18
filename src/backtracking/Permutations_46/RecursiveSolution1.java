package backtracking.Permutations_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

class RecursiveSolution1 {

    private List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        backtrack(new int[nums.length], 0, nums);
        return result;
    }

    private void backtrack(int[] a, int lvl, int[] nums) {
        if (isCompleteSolution(a, lvl)) {
            processSolution(a);
        } else {
            for (int candidate : constructCandidates(a, lvl, nums)) {
                a[lvl] = candidate;
                backtrack(a, lvl + 1, nums);
            }
        }
    }

    private void processSolution(int[] a) {
        result.add(Arrays.stream(a).boxed().toList());
    }

    private boolean isCompleteSolution(int[] a, int lvl) {
        return lvl == a.length;
    }

    private int[] constructCandidates(int[] a, int lvl, int[] nums) {
        Set<Integer> inPerm = Arrays.stream(a).limit(lvl).boxed().collect(toSet());
        return Arrays.stream(nums).filter(num -> !inPerm.contains(num)).toArray();
    }
}
