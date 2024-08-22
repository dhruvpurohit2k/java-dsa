//This is a binary tree inorder traversal where the path of traversal is returned as a list.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> leftList = inorderTraversal(root.left);
        List<Integer> rightList = inorderTraversal(root.right);
        if(leftList.size()>0) list.addAll(leftList);
        list.add(root.val);
        if(rightList.size()>0) list.addAll(rightList);
        return list;
    }
}
