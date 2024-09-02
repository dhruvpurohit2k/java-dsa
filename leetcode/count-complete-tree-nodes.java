
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = root.left==null?0:countNodes(root.left);
        int right = root.right==null?0:countNodes(root.right);
        int size=0;
        if(left!=-1) size+=left;
        if(right!=-1) size+=right;
        return size+1;
    }
}
