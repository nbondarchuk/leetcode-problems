package strings.LengthOfLastWord_58;

class Solution {

    public int lengthOfLastWord(String s) {
        int wordEndIndex;
        int wordStartIndex;

        int idx = s.length() - 1;
        while (idx >= 0 && s.charAt(idx) == ' ') {
            idx--;
        }
        wordEndIndex = idx;

        while (idx > 0 && s.charAt(idx-1) != ' ') {
            idx--;
        }
        wordStartIndex = idx;

        return wordEndIndex - wordStartIndex + 1;
    }
}
