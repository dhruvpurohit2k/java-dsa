//The trick is the realise that for any given subarray, the maximum value after bitwise operations is always smaller or maybe equal to the biggest value in that subarray. Since a single element is also a subarray. We need to find out subarrays which after performing bitwise AND on give us the greatest number in the original array. Since the result is almost always smaller than the number. The subarrays must only consist of the greatest numbers. Thus is question is finding out the subarray with the largest number of the greatest number present in the original array.
class Solution {
    public int longestSubarray(int[] nums) {    
        int maxnum = 0;
        int maxnumCount = 0;
        int result = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>maxnum){
                maxnum = nums[i];
                maxnumCount = 1;
                result = 1;
            }else if(nums[i]==maxnum){
                maxnumCount ++;
            }else if(nums[i]!=maxnum){
                if(maxnumCount>result){
                    result = maxnumCount;
                    maxnumCount = 0;
                }else {
                    maxnumCount = 0;
                }
            }
        }
        
        return Math.max(maxnumCount,result);
    }
}
