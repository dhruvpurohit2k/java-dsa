
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null)
            list.add(root.val);
        else return list;
        if (root.left != null)
            list.addAll(preorderTraversal(root.left));
        if (root.right != null)
            list.addAll(preorderTraversal(root.right));
        return list;

    }
}
