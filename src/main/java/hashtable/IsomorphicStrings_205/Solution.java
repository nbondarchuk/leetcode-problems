package hashtable.IsomorphicStrings_205;

import java.util.Arrays;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return check(s, t) && check(t, s);
    }

    private boolean check(String s, String t) {
        int[] mappingTable = new int[128];
        Arrays.fill(mappingTable, -1);
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if (mappingTable[sCh] == -1) {
                mappingTable[sCh] = tCh;
            } else {
                if (mappingTable[sCh] != tCh) {
                    return false;
                }
            }
        }
        return true;
    }
}
