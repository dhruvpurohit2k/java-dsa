//First convert every int into string and then sort on the basis if element a + b is bigger of b + a is bigger
class Solution {
    public String largestNumber(int[] nums) {
        String[] numsString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsString[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numsString);
        StringBuilder sb = new StringBuilder();
        Arrays.sort(numsString, (a, b) -> (b+a).compareTo(a + b));
        if (numsString[0].equals("0"))
            return "0";
        for (int i = 0; i < nums.length; i++) {
            sb.append(numsString[i]);
        }

        return sb.toString();
    }
}
