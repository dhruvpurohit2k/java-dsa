//Better solution which uses Binary Search
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target&&target<=nums[mid]){
                    right = mid-1;
                }else {
                    left=mid+1;
                }
            }else{
                if(nums[mid]<=target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}



//My Solution
class Solution {
    public int search(int[] nums, int target) {
        if(nums[0]==target) return 0;
        int pos = -1;
        int dir, i;
        if(target<nums[0]){
            dir = -1;
            i = nums.length-1;
        }else{
            dir = 1;
            i = 1;
        }
        for(;i<nums.length&&i>0;i+=dir){
            if(nums[i]==target) return i;
            if(dir==-1 && nums[i]-target<0) break;
            if(dir==1&&target-nums[i]<0) break;
        }
        return pos;
    }
}
