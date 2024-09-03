class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.right;
        invertTree(root.right);
        invertTree(root.left);
        root.right = root.left;
        root.left = temp;
        return root;
        
    }
}
