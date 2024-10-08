package arrays.SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }

        int start = 0;
        for (int end = 1; end <= nums.length; end++) {
            if (end == nums.length || nums[end] != nums[end - 1] + 1) {
                if (start == end - 1) {
                    ans.add(String.valueOf(nums[start]));
                } else {
                    ans.add(nums[start] + "->" + nums[end - 1]);
                }

                start = end;
            }
        }

        return ans;
    }
}
