package hashtable.LongestSubstringWithoutRepeatingCharacters_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int left = 0, length = 1;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.get(c) != null) {
                // abba - when the second 'a' is reached, left will be = 2 and map.get('a') will return 0
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
