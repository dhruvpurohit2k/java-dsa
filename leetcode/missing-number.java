class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int size = (n)*(n+1)/2;
        int i = 0;
        while(i<n){
            size-=nums[i];
            i++;
        }
        return size;
    }
}
