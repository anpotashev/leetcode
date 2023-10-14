package zigzagconversion;

class Solution {
    public String convert(String s, int numRows) {
        char[] result = new char[s.length()];
        int counter = 0;
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            int counter_1 = counter;
            int counter_2 = counter + 1;
            for (int i = rowNum; i < s.length(); i += Math.max(1, numRows * 2 - 2)) {
                result[counter_1] = s.charAt(i);
                counter++;
                counter_1 += (rowNum != 0 && rowNum != numRows - 1) ? 2 : 1;
            }
            if (rowNum != 0 && rowNum != numRows - 1) {
                for (int i = numRows * 2 - rowNum - 2; i < s.length(); i += Math.max(1, numRows * 2 - 2)) {
                    result[counter_2] = s.charAt(i);
                    counter++;
                    counter_2 += 2;
                }
            }
        }
        return new String(result);
    }
}