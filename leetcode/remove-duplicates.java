//The trick is to keep a copy of the node and itterate over the list till you find a node which does not contain the same value;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode firstNode = head;
        while(head!=null&&head.next!=null){
            ListNode currentNode = head;
            while(head.next!=null&&head.val==head.next.val){
                head = head.next;
            }
            head = head.next;
            currentNode.next = head;
            
        }
        return firstNode;
    }
}
