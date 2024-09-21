package strings.ValidAnagram_242;

class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ch1[s.charAt(i) - 'a']++;
            ch2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }
}
