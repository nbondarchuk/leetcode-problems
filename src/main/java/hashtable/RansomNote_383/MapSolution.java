package hashtable.RansomNote_383;

import java.util.HashMap;
import java.util.Map;

class MapSolution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            Integer count = map.get(ch);
            if (count == null || count == 0) {
                return false;
            }

            map.put(ch, count - 1);
        }

        return true;
    }
}