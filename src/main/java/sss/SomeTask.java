package sss;

import java.util.Collections;

public class SomeTask {

    public String encrypt(String s) {
        String result = "";
        int index = 0;
        int nextCount = 1;
        while (index < s.length()) {
            if (isDigit(s.charAt(index))) {
                int startCountIndex = index;
                while (s.charAt(index+1) != '[') {
                    index++;
                }
                int count = Integer.valueOf(s.substring(startCountIndex, index));
                int openedBrackets = 1;
                String subStr = "";
                while (true) {
                    index++;
                    char nextChar = s.charAt(index);
                    if (nextChar == ']') {
                        openedBrackets --;
                    }
                    if (nextChar == '[') {
                        openedBrackets++;
                    }
                    if (openedBrackets == 0) {
                        break;
                    }
                    subStr = subStr + nextChar;
                }
                String subString = encrypt(subStr);
                result = result +subString.repeat(count);
            }
            result = result + s.charAt(index);
            index++;
        }
        return s;
    }

    public boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
