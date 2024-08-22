//To check whether 2 give tree structure are the same or note
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p!=null) return false;
        if(q!=null && p==null) return false;
        if(q==null && p==null) return true;
        if(q.val!=p.val) return false;
        if(!isSameTree(p.left,q.left)) return false;
        if(!isSameTree(p.right,q.right)) return false;
        return true;

    }
}
