//We calculate the difference between the heights of the 2 subtrees and return -1 if the height is greater than 1
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (compareHeight(root) == -1)
            return false;
       
            return true;
    }

    int compareHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = compareHeight(root.left);
        int rightHeight = compareHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1)
            return -1;
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
