//We travel down the left and the right tree keep adding nodes to the respective stacks. Then we compare the stacks. If we get any differece we return false. If everything checks out we close the loop and return true;
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        TreeNode left = root.left;
        TreeNode right = root.right;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        while((left!=null || right!=null) || (!leftStack.isEmpty()) || (!rightStack.isEmpty())){
            while(left!=null){
                leftStack.push(left);
                left=left.left;
            }
            while(right!=null){
                 rightStack.push(right);
                right = right.right;
            }
            if(leftStack.size()!=rightStack.size()) return false;
            left = leftStack.pop();
            right = rightStack.pop();
            if(left.val!=right.val) return false;
            left = left.right;
            right = right.left;
        }
        return true;
    }
}
//This solution uses recurssion to check the symmetry. If the two nodes are null we return true. If one of them is null we return false. finally return the true if the vale in the two nodes are equal and the two subtrees return true using the helper function.
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
