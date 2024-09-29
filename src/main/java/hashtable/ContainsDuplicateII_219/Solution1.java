package hashtable.ContainsDuplicateII_219;

import java.util.HashMap;
import java.util.Map;

class Solution1 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer i2 = map.get(num);
            if (i2 != null && Math.abs(i - i2) <= k) {
                return true;
            }
            map.put(num, i);
        }
        return false;
    }
}