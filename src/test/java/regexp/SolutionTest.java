package regexp;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SolutionTest extends TestCase {
    @ParameterizedTest
    @CsvSource(value = {"aa:a:false", "aa:a*:true", "ab:.*:true"}, delimiter = ':')
    public void testIsMatch(String s, String p, Boolean expected) {
        Assert.assertEquals(expected, new Solution().isMatch(s, p));
    }
}