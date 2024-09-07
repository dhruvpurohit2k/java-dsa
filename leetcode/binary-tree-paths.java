class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root.right==null&&root.left==null) {
            result.add(Integer.toString(root.val));
            return result;
            }
        if(root.left!=null)result.addAll(binaryTreePaths(root.left));
        if(root.right!=null)result.addAll(binaryTreePaths(root.right));
        for(int i = 0;i<result.size();i++){
            String curr = result.get(i);
            result.set(i,Integer.toString(root.val)+"->"+curr);
        }
        return result;     
    }
}
