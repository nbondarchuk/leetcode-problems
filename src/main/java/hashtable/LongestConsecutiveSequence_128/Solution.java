package hashtable.LongestConsecutiveSequence_128;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int globalLen = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentLen = 1;
                int currentNum = num;
                while (numSet.contains(currentNum + 1)) {
                    currentLen++;
                    currentNum++;
                }

                globalLen = Math.max(currentLen, globalLen);
            }
        }

        return globalLen;
    }
}
