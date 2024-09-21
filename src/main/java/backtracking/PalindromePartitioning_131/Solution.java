package backtracking.PalindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<String>> partition(String s) {
        List<String> path = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        doPartition(0, s, path, result);
        return result;
    }

    private void doPartition(int idx, String s, List<String> path, List<List<String>> result) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(path));
        } else {
            for (int i = idx; i < s.length(); i++) {
                if (isPalindrome(s, idx, i)) {
                    path.add(s.substring(idx, i + 1));
                    doPartition(i + 1, s, path, result);
                    path.remove(path.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
