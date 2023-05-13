package hashtable.IntegerToRoman_12;

import java.util.*;

class Solution {

    private static final Map<Integer, String> map = new LinkedHashMap<>();
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int current : map.keySet()) {
            while (num >= current) {
                sb.append(map.get(current));
                num -= current;
            }
        }
        return sb.toString();
    }
}
