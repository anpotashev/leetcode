package containerwithmostwater;

/**
 * https://leetcode.com/problems/container-with-most-water/submissions/1075242346/
 */
class Solution {

    public int maxArea(int[] height) {
        return maxArea(height, 0, height.length-1);
    }

    private int maxArea(int[] height, int startIndex, int endIndex) {
        int result = square(startIndex, endIndex, height);

        if (height[startIndex] < height[endIndex]) {
            int xNext = startIndex;
            while (height[xNext] <= height[startIndex] ) {
                xNext++;
                if (xNext == endIndex) return result;
            }
            return Math.max(result, maxArea(height, xNext, endIndex));
        }

        if (height[startIndex] > height[endIndex]) {
            int xNext = endIndex;
            while (height[xNext] <= height[endIndex] ) {
                xNext--;
                if (xNext == startIndex) return result;
            }
            return Math.max(result, maxArea(height, startIndex, xNext));
        }

        int xNext1 = startIndex;
        while (height[xNext1] <= height[startIndex] ) {
            xNext1++;
            if (xNext1 == endIndex) return result;
        }
        int xNext2 = endIndex;
        while (height[xNext2] <= height[endIndex] ) {
            xNext2--;
            if (xNext2 == xNext1) return result;
        }
        return Math.max(result, maxArea(height, xNext1, xNext2));
    }
    private int square(int xStart, int xEnd, int[] height) {
        return (xEnd - xStart)*Math.min(height[xStart], height[xEnd]);
    }
}