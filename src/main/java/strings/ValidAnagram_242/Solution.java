package strings.ValidAnagram_242;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counters.compute(s.charAt(i), (k, v) -> {
                if (v == null) {
                    return 1;
                }

                int v1 = v + 1;
                return v1 == 0 ? null : v1;
            });
            counters.compute(t.charAt(i), (k, v) -> {
                if (v == null) {
                    return -1;
                }

                int v1 = v - 1;
                return v1 == 0 ? null : v1;
            });
        }
        return counters.isEmpty();
    }
}
