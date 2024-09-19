package strings.IsSubsequence_392;

class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int tIndex = 0;
        int sIndex = 0;

        while (tIndex < t.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                tIndex++;
                sIndex++;
            } else {
                tIndex++;
            }

            if (sIndex == s.length()) {
                return true;
            }
        }

        return false;
    }
}
