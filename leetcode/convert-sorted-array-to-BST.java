//We take middle of the array and make it a node and pass the left and right array to repeat the operation.
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n==0) return null;

        return createTree(nums,0,n-1);
    }
    TreeNode createTree(int[] nums, int start,int end){
        if(start>end) return null;
        int middle = start + (end-start) /2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = createTree(nums,start,middle-1);
        node.right = createTree(nums,middle+1,end);
        return node;
    }
}
