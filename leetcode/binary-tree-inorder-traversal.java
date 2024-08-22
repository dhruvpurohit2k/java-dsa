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
//This solution uses Iteration instead of recurssion to traverse the node. What is does is it goes to the left most node and while going it pushes the nodes to the stack. Then we pop the latest added node and add its value to the result List. the root node then becomes the right node.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
