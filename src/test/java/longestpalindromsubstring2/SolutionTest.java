package longestpalindromsubstring2;

import junit.framework.TestCase;
import org.junit.Assert;

public class SolutionTest extends TestCase {

    public void testLongestPalindrome() {
        String s = "babad";
        String expected = "bab";
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(s);
        Assert.assertEquals(expected, actual);
    }
    public void testLongestPalindrome2() {
        String s = "cbbd";
        String expected = "bb";
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(s);
        Assert.assertEquals(expected, actual);
    }

    public void testLongestPalindrome3() {
        String s = "cbbdabba";
        String expected = "abba";
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(s);
        Assert.assertEquals(expected, actual);
    }

    public void testLongestPalindrome4() {
        String s = "jfbnhnjamsfsbsslcaaivnzryrrkcqmektqjnymeifxvvskicpxxrztysetlpucxfqccmeyptxxziqhacxatxjynmbblssyaxvcmbtyrtqfwxrwsgfrinfkczktytwglbrskeogamecvihkywnljnqfmrrnqcvopcoyroncwzhdqzvwdbtjmcocwljjvipabzorajqgiabqjeyasbrjvyjtdvgupqtmydfgdczaodyokxxarfboxifcltizhhntciffijclljvdfgpsojwmupgtrbquuzjdefnmxtcaborisjcsavucmuovlksonzvmmuvujzirioxdcadeioravjoyxhrqevfwmxacimtvbmfweqpvfijyuqrjfgejrnlmhvbbmbvviilsothgvaqgqtllonrqbsltwpikfrckdhttxzmbqmbhbjjwfddnrfwtafgjtuqyatkpcavokouftqwdzfclkckwzfwlozksgkrcyimvdhfrzlqqxnfhjkwfiewwqmbfyjdjematsvusmqxzwfyukqwlfzzyzlkqvgmq";
        String expected = "iffi";
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(s);
        Assert.assertEquals(expected, actual);
    }

    public void testLongestPalindrome5() {
        String s = "aaaaa";
        String expected = "aaaaa";
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(s);
        Assert.assertEquals(expected, actual);
    }
}