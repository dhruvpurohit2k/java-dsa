//Create a hash set keeping adding value that are in the set and remove the ones that are already there. The return the remaing element in the set.
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(!set.contains(nums[i])) set.add(nums[i]);
            else set.remove(nums[i]);
        }
        Iterator<Integer> i = set.iterator();
        return i.next();
    }
}
