package median2;

// Не моё
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c1 = 0;
        int c2 = 0;
        boolean found1 = false;
        boolean found2 = false;
        boolean found = false;
        int l = nums1.length + nums2.length;
        int l1 = (l%2 == 0) ? ((l/2)) : ((l+1)/2);
        int l2 = (l%2 == 0) ? ((l/2)+1) : ((l+1)/2);
        l1--;
        l2--;
        int n1 = 0;
        int n2 = 0;
        while (!found){
            int num1;
            int index = c1 + c2;
            if (c1 >= nums1.length){
                num1 = 10000000;
            }else{
                num1 = nums1[c1];
            }
            int num2;
            if (c2 >= nums2.length){
                num2 = 10000000;
            }else{
                num2 = nums2[c2];
            }
            int fn = 0;
            if (num1 < num2){
                c1++;
                fn = num1;
            }else if (num1 > num2){
                c2++;
                fn = num2;
            }else{
                c1++;
                fn = num1;
            }
            if (index == l1){
                n1 = fn;
                found1 = true;
            }
            if (index == l2){
                n2 = fn;
                found2 = true;
            }
            found = (found1 == true) && (found2 == true);
        }
        return (double) (n1+n2)/2;
    }
}