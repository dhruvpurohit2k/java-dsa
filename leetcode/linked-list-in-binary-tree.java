//The trick is to use Depth First Search. We pass the root node head of the list and a current pointer pointed to the head. If the come across a tree node which has the same value as the current node we increase that. If we find that the current node is not the same but head node is we increase the head node else if none of the conditions are true we reset the current pointer to head. 
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        return dfs(head,head,root);
    }
    public boolean dfs(ListNode head,ListNode current,TreeNode root){
        if(current==null) return true;
        if(root==null) return false;
        if(current.val==root.val){
            current=current.next;
        }else if(head.val==root.val){
            head=head.next;
        }else {
            current=head;
        }
        return dfs(head,current,root.right)||dfs(head,current,root.left);
    }
}
