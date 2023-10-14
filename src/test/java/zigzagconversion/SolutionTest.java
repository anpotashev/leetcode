package zigzagconversion;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testConvert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        Solution solution = new Solution();
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }
    public void testConvert2() {
        String s = "A";
        int numRows = 1;
        String expected = "A";
        Solution solution = new Solution();
        String actual = solution.convert(s, numRows);
        assertEquals(expected, actual);
    }
}