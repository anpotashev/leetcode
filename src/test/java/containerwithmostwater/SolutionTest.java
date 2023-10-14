package containerwithmostwater;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

    public void testSolution() {
        Solution solution = new Solution();
        int src[] = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int actual = solution.maxArea(src);
        assertEquals(expected,actual);
    }
}