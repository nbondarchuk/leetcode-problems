package strings.SubstringWithConcatenationOfAllWords_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : words) {
            map.put(string, 1);
        }

        int sLen = s.length();
        int wordsLen = words.length;
        int wordLen = words[0].length();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < wordLen; i++) {
            int count = 0;
            Map<String, Integer> temp = new HashMap<>();
            for (int j = i, k = i; j + wordLen <= sLen; j = j + wordLen) {
                String word = s.substring(j, j + wordLen);
                temp.put(word, temp.getOrDefault(word, 0) + 1);
                count++;

                if (count == wordsLen) {
                    if (map.equals(temp)) {
                        ans.add(k);
                    }

                    String toRemove = s.substring(k, k + wordLen);
                    temp.computeIfPresent(toRemove, (a, b) -> b > 1 ? b - 1 : null);
                    count--;
                    k = k + wordLen;
                }
            }
        }
        return ans;
    }
}
