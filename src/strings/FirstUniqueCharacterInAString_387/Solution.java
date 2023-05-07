package strings.FirstUniqueCharacterInAString_387;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            counts.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (counts.containsKey(s.charAt(i)) && counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
