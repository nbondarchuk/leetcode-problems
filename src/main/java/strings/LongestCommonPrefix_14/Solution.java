package strings.LongestCommonPrefix_14;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder prefix = new StringBuilder();
        while (true) {
            Character ch = null;
            for (int j = 0; j < strs.length; j++) {
                String str = strs[j];
                if (i > str.length() - 1) {
                    return prefix.toString();
                }
                if (ch == null) {
                    ch = str.charAt(i);
                } else if (ch != str.charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
            i++;
        }
    }
}
