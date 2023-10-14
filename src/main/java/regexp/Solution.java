package regexp;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        List<RegexpRule> rules = new ArrayList();
        for (char c : p.toCharArray()) {
            if (c != '*') {
                RegexpRule regexpRule = new RegexpRule();
                regexpRule.aChar = c;
                rules.add(regexpRule);
            } else {
                rules.get(rules.size() - 1).single = false;
            }
        }
        int workIndex = 0;
        RegexpRule currentRule = rules.get(0);
        int currentRuleIndex = 0;
        while (workIndex < s.length()) {
            if (!rules.get(currentRuleIndex).ruleIsUsed()) {
                rules.get(currentRuleIndex).startCurrentPos = workIndex;
                rules.get(currentRuleIndex).endCurrentPos = workIndex;
            }
            if (rules.get(currentRuleIndex).checkFullString(s)) {

            }
        }
        return false;
    }

    private class RegexpRule {
        char aChar;
        boolean single = true;
        Integer startCurrentPos = null;
        Integer endCurrentPos = null;

        boolean ruleIsUsed() {
            return startCurrentPos != null;
        }

        boolean checkFullString(String s) {
            return check(s.substring(startCurrentPos, endCurrentPos));
        }
        boolean check(String s) {
            if (single) {
                if (s.length() > 1) return false;
                if (aChar == '.') return true;
                return aChar == s.charAt(0);
            }
            if (aChar == '.') return true;
            for (char c: s.toCharArray()) {
                if (c != aChar) return false
            }
            return true;
        }
    }
}