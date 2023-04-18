package arrays.IntersectionOfTwoArraysII_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numsShorter = nums1.length < nums2.length ? nums1 : nums2;
        int[] numsLonger = nums1 == numsShorter ? nums2 : nums1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numsShorter.length; i++) {
            Integer count = map.getOrDefault(numsShorter[i], 0);
            map.put(numsShorter[i], count + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numsLonger.length; i++) {
            Integer count = map.get(numsLonger[i]);
            if (count != null && count > 0) {
                list.add(numsLonger[i]);
                map.put(numsLonger[i], count - 1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
