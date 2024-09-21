package math.PascalsTriangle_118;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(prev);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                list.add(prev.get(j) + prev.get(j + 1));
            }
            list.add(1);

            result.add(list);
            prev = list;
        }
        return result;
    }
}
