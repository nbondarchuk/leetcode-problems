package hashtable.WordPattern_290;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        String[] chars = new String[pattern.length()];
        for (int i = 0; i < pattern.length(); i++) {
            chars[i] = pattern.charAt(i) + "";
        }

        if (words.length != chars.length) {
            return false;
        }

        return check(words, chars) && check(chars, words);
    }

    private boolean check(String[] s1, String[] s2) {
        Map<String, String> mappingTable = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String s1Mapping = mappingTable.get(s1[i]);
            if (s1Mapping == null) {
                mappingTable.put(s1[i], s2[i]);
            } else {
                if (!s1Mapping.equals(s2[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
