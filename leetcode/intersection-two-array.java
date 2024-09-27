//Sorting the arrays so that we can check if i j are smaller or equal to each other. if i is smaller then we increase i since they are sorted there is no j which will equal i and visa versa
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        HashSet<Integer> result = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]) {
                if(!result.contains(nums1[i]))
                result.add(nums1[i]);
                i++;j++;
            }else if(nums1[i]<nums2[j])i++;
            else j++;
        }
        int[] output = new int[result.size()];
        int count = 0;
        for(int k : result){
            output[count++] = k;
        }
        return output;   
    }
}
