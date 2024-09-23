//Sorting the array helps to eliminate duplicate values
//The trick is use 4 pointers
//we create 2 pointers i and j where j = i +1
//Then we create 2 more left and right where left = j+1 and right = size -1
//The then simply compute the sum and add them to the result if they match the target
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();

        
        Arrays.sort(nums);

        for(int i = 0; i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j = i+1; j<nums.length;j++){
                if(j!=i+1&&nums[j-1]==nums[j]) continue;
                int left = j+1;
                int right = nums.length-1;

                while(left<right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum==target){
                        result.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }else if(sum<target){
                        left++;
                    }else right--;
                }
            }
        }
        return result;
    }
}
