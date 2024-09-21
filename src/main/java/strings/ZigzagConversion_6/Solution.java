package strings.ZigzagConversion_6;

class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows > s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int rowNum = 0;
        boolean goingDown = true;
        for (int i = 0; i < s.length(); i++) {
            rows[rowNum].append(s.charAt(i));
            if (goingDown) {
                rowNum += 1;
                if (rowNum == numRows - 1) {
                    goingDown = false;
                }
            } else {
                rowNum -= 1;
                if (rowNum == 0) {
                    goingDown = true;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            result.append(rows[i]);
        }
        return result.toString();
    }
}
