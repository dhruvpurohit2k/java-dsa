class Solution {
    public List<String> summaryRanges(int[] nums) {
        StringBuilder sb = new StringBuilder();
        List<String> output = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            int start = nums[i];
            sb.setLength(0);
            while( i+1<nums.length&&nums[i+1]-nums[i]==1){
                i++;
            }
            if(nums[i]!=start){
                sb.append(start);
                sb.append("->");
                sb.append(nums[i]);
            }else{
                sb.append(start);
            }
            output.add(sb.toString());
        }
        return output;
    }
}
