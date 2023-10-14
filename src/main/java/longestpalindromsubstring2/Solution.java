package longestpalindromsubstring2;

public class Solution {

    public String longestPalindrome(String s) {
        String result = s.substring(0, 1);
       for (int i = 0; i < s.length() - (result.length() / 2); i++) {
            for (int j = 1; i - j >= 0 &&  i + j < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j)) {
                    break;
                }
                if (result.length() < j+j+1) {
                    result = s.substring(i - j, i + j + 1);
                }
            }
        }
        for (int i = result.length() / 2 + 1; i < s.length() - result.length() / 2 + 1; i++ ) {
            for (int j = 1; i - j >=0 && i + j - 1 < s.length(); j++) {
                if (s.charAt(i - j) != s.charAt(i + j - 1)) {
                    break;
                }
                if (result.length() < j + j) {
                    result = s.substring(i - j, i + j);
                }
            }
        }
        return result;
    }

}
