//We first iterate over the list to see whether the element to remove is at the start of the list. The we simply see if the next contains the ele or not. If it does we iterate over the list till its is not or becomes null.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    
        while(head!=null&&head.val == val){
            head=head.next;
        }
        ListNode original = head;
        while(head!=null){
            ListNode curr = head.next;
            while(curr!=null && curr.val==val){
                curr = curr.next;
            }
            head.next = curr;
            head = head.next;
        }
        return original;
    }
}
