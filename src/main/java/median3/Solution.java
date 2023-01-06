package median3;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        WrappedIntArrayPair pair = new WrappedIntArrayPair(new WrappedIntArray(nums1), new WrappedIntArray(nums2));
        pair = processArraysPair(pair);
        if (pair.arr2.length == 0) {
            if (pair.arr1.length == 1) {
                return pair.arr1.get(0);
            } else {
                return (pair.arr1.get(0) + pair.arr1.get(1)) / 2.0;
            }
        } else {
            if (pair.arr1.length == 3) {
                if (pair.arr1.get(0) >= pair.arr2.get(0)) {
                    return (pair.arr1.get(0) + pair.arr1.get(1)) / 2.0;
                }
                if (pair.arr1.get(2) <= pair.arr2.get(0)) {
                    return (pair.arr1.get(2) + pair.arr1.get(1)) / 2.0;
                }
                return (pair.arr2.get(0) + pair.arr1.get(1)) / 2.0;
            }
            if (pair.arr1.length == 1) {
                return (pair.arr1.get(0) + pair.arr2.get(0)) / 2.0;
            }
            if (pair.arr1.get(0) < pair.arr2.get(0)) {
                return Math.min(pair.arr1.get(1), pair.arr2.get(0));
            }
            return pair.arr1.get(0);
        }
    }

    private WrappedIntArrayPair processArraysPair(WrappedIntArrayPair pair) {
        if (pair.arr1.length < pair.arr2.length) {
            pair.swapArrays();
        }
        if (pair.arr1.length > pair.arr2.length + 2) {
            int delta = (pair.arr1.length - pair.arr2.length - 1) / 2;
            pair.arr1.removeLastN(delta).removeFirstN(delta);
        }
        if (pair.arr2.length <= 1) {
            return pair;
        }
        int delta = pair.arr2.length / 2;
        if (pair.arr1.get(pair.arr1.length - delta) < pair.arr2.get(pair.arr2.length - delta)) {
            pair.arr2.removeLastN(delta);
        } else {
            pair.arr1.removeLastN(delta);
        }
        if (pair.arr1.get(delta - 1) > pair.arr2.get(delta - 1)) {
            pair.arr2.removeFirstN(delta);
        } else {
            pair.arr1.removeFirstN(delta);
        }
        return processArraysPair(pair);
    }

    static class WrappedIntArray {
        int[] array;
        int startIndex;
        int length;
        public WrappedIntArray(int[] array) {
            this.array = array;
            this.startIndex = 0;
            this.length = array.length;
        }
        int get(int i) {
            return array[i + startIndex];
        }

        WrappedIntArray removeLastN(int n) {
            length -= n;
            return this;
        }
        void removeFirstN(int n) {
            startIndex += n;
            length -= n;
        }
    }
    static class WrappedIntArrayPair {
        WrappedIntArray arr1;
        WrappedIntArray arr2;

        public WrappedIntArrayPair(WrappedIntArray arr1, WrappedIntArray arr2) {
            this.arr1 = arr1;
            this.arr2 = arr2;
        }

        public void swapArrays() {
            WrappedIntArray tmp = arr1;
            arr1 = arr2;
            arr2 = tmp;
        }
    }
}