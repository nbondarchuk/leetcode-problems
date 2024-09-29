package hashtable.ContainsDuplicateII_219;

import java.util.HashSet;
import java.util.Set;

class Solution2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int x = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.size() > k) {
                set.remove(nums[x++]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
