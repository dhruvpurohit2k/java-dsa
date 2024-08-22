//No trick here just checking if the number in array 2 is smaller than current number of 1 and if it is we push it. when are at the end of the array 1 we then simply copy over the numbers.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        if (m == 0) {
            int j = 0;
            while (j < n) {
                nums1[j] = nums2[j];
                j++;
            }
            return;
        }
        int i, j;
        i = j = 0;
        while (j < n) {
            if (nums1[i] <= nums2[j] && i < m) {
                i++;
            } else if (nums1[i] > nums2[j] && i < m) {
                int numberToPush = nums2[j];
                int currenti = i;
                i++;
                j++;
                while (currenti < m + 1) {
                    int temp = nums1[currenti];
                    nums1[currenti] = numberToPush;
                    numberToPush = temp;
                    currenti++;
                }
                m++;
            } else {
                nums1[i++] = nums2[j++];
            }
        }
    }

}
