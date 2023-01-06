package median;

import java.util.Arrays;

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        IntArrayPair pair = new IntArrayPair(nums1, nums2);
        pair = processArraysPair(pair);
        if (pair.arr2.length == 0) {
            if (pair.arr1.length == 1) {
                return pair.arr1[0];
            } else {
                return (pair.arr1[0] + pair.arr1[1]) / 2.0;
            }
        } else {
            if (pair.arr1.length == 3) {
                if (pair.arr1[0] >= pair.arr2[0]) {
                    return (pair.arr1[0] + pair.arr1[1]) / 2.0;
                }
                if (pair.arr1[2] <= pair.arr2[0]) {
                    return (pair.arr1[2] + pair.arr1[1]) / 2.0;
                }
                return (pair.arr2[0] + pair.arr1[1]) / 2.0;
            }
            if (pair.arr1.length == 1) {
                return (pair.arr1[0] + pair.arr2[0]) / 2.0;
            }
            if (pair.arr1[0] < pair.arr2[0]) {
                return Math.min(pair.arr1[1], pair.arr2[0]);
            }
            return pair.arr1[0];

        }
    }

    private IntArrayPair processArraysPair(IntArrayPair pair) {
        if (pair.arr1.length < pair.arr2.length) {
            pair.swapArrays();
        }
        if (pair.arr1.length > pair.arr2.length + 2) {
            int delta = (pair.arr1.length - pair.arr2.length - 1) / 2;
            pair.arr1 = Arrays.copyOfRange(pair.arr1, delta, pair.arr1.length - delta);
        }
        if (pair.arr2.length <= 1) {
            return pair;
        }
        int delta = pair.arr2.length / 2;
        if (pair.arr1[pair.arr1.length - delta] < pair.arr2[pair.arr2.length - delta]) {
            pair.arr2 = Arrays.copyOfRange(pair.arr2, 0, pair.arr2.length - delta);
        } else {
            pair.arr1 = Arrays.copyOfRange(pair.arr1, 0, pair.arr1.length - delta);
        }
        if (pair.arr1[delta - 1] > pair.arr2[delta - 1]) {
            pair.arr2 = Arrays.copyOfRange(pair.arr2, delta, pair.arr2.length);
        } else {
            pair.arr1 = Arrays.copyOfRange(pair.arr1, delta, pair.arr1.length);
        }
        return processArraysPair(pair);
    }

    static class IntArrayPair {
        int[] arr1;
        int[] arr2;

        public IntArrayPair(int[] arr1, int[] arr2) {
            this.arr1 = arr1;
            this.arr2 = arr2;
        }

        public void swapArrays() {
            int[] tmp = arr1;
            arr1 = arr2;
            arr2 = tmp;
        }
    }
}
