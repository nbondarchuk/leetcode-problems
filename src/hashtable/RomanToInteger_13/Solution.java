package hashtable.RomanToInteger_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Short> map = new HashMap<>(7);
    static {
        map.put('I', (short) 1);
        map.put('V', (short) 5);
        map.put('X', (short) 10);
        map.put('L', (short) 50);
        map.put('C', (short) 100);
        map.put('D', (short) 500);
        map.put('M', (short) 1000);
    }

    public int romanToInt(String s) {
        short result = 0;
        short current, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            current = map.get(s.charAt(i));
            if (current >= prev) {
                result += current;
            } else {
                result -= current;
            }
            prev = current;
        }
        return result;
    }
}
