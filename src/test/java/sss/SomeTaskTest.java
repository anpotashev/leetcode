package sss;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SomeTaskTest extends TestCase {

    @ParameterizedTest
    @CsvSource(value = {"abc:abc", "10[a]:aaaaaaaaaa", "2[a]:aa", "2[ab]c4[a]:ababcaaaa","a3[b3[ab]]:ababababababababababbabababababababababbababababababababab"}, delimiter = ':')
    public void testEncrypt(String source, String expected) {
        String actual = new SomeTask().encrypt(source);
        Assert.assertEquals(expected, actual);
    }
}