package arrays.HIndex_274;

import java.util.Arrays;

class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int hIndex = 0;
        int numPapers = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            numPapers += 1;
            if (citations[i] > 0) {
                int newHIndex = Math.min(numPapers, citations[i]);
                if (newHIndex < hIndex) {
                    break;
                } else {
                    hIndex = newHIndex;
                }
            } else {
                break;
            }
        }

        return hIndex;
    }
}
