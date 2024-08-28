//we make a hashmap to keep track of number and its occurances. We keep on updating the majorityNumber as we encounter a number with higher frequency. Slow and takes up a lot of space.
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int majorityNumber = 0;
        int majorityNumberCounter = 0;
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],1+map.getOrDefault(nums[i],0));
            if(majorityNumberCounter<map.get(nums[i])){
                majorityNumber = nums[i];
                majorityNumberCounter = map.get(nums[i]);
            }
        }
        return majorityNumber;
    }
}
//We create a variable majority to track of instances of the result element. if the majority becomes 0 we update the result element. If we encounter the element again we increase majority or else we decrease it.
class Solution {
    public int majorityElement(int[] nums) {
        int majority =0;
        int result = 0;
        for(int i = 0; i<nums.length;i++){
            if(majority==0){
                result = nums[i];
            }
            majority += result==nums[i]? 1:-1;
        }
        return result;
    }
}
