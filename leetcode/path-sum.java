//Travel down the tree and keep on reducing the targetSum by the val at the node. return true if at a leaf node the value of targetSum is 0. The name of the second function should be helperPathSum.
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return getPathSum(root,targetSum);
    }
    boolean getPathSum(TreeNode root, int targetSum){
        if(root==null&&targetSum==0) return true;
        else if(root==null&&targetSum!=0) return false;
        if(root.right==null) return getPathSum(root.left,targetSum-root.val);
        if(root.left==null) return getPathSum(root.right,targetSum-root.val);
        return getPathSum(root.right,targetSum-root.val) || getPathSum(root.left,targetSum-root.val);
    }
}
