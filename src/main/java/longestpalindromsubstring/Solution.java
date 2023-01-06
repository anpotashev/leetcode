package longestpalindromsubstring;

public class Solution {

    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length() - result.length(); i++) {
            for (int j = s.length(); j - i > result.length(); j--) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring)) {
                    result = substring;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i ++ ) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

}
