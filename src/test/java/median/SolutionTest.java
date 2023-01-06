package median;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {4, 5, 6};
        double expected = 3.5;
        double actual = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, actual, 0.01);
    }



    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] arr1 = new int[] {1, 2, 3, 3, 4, 5, 6};
        int[] arr2 = new int[] {4, 5, 6};
        double expected = 4.0;
        double actual = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, actual, 0.01);
    }



    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] arr1 = new int[] {1, 2, 3, 3, 4, 5, 6};
        int[] arr2 = new int[] {};
        double expected = 3.0;
        double actual = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, actual, 0.01);
    }



    @Test
    public void test4() {
        Solution solution = new Solution();
        int[] arr1 = new int[] {1, 2, 3, 3, 4, 5, 6, 7};
        int[] arr2 = new int[] {};
        double expected = 3.5;
        double actual = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, actual, 0.01);
    }



    @Test
    public void test5() {
        Solution solution = new Solution();
        int[] arr1 = new int[] {1};
        int[] arr2 = new int[] {2, 3, 4};
        double expected = 2.5;
        double actual = solution.findMedianSortedArrays(arr1, arr2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
