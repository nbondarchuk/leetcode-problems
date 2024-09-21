package strings.MinimumWindowSubstring_76;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int j = 0;
        int k = -1;
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.getOrDefault(ch, 0) >= window.getOrDefault(ch, 0)) {
                cnt++;
            }

            while (cnt == t.length()) {
                if (i - j + 1 < min) {
                    min = i - j + 1;
                    k = j;
                }

                if (need.getOrDefault(s.charAt(j), 0) >= window.getOrDefault(s.charAt(j), 0)) {
                    cnt--;
                }

                window.put(s.charAt(j), window.getOrDefault(s.charAt(j), 0) - 1);
                j++;
            }
        }

        return k < 0 ? "" : s.substring(k, k + min);
    }
}
