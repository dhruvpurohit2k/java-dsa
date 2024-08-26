//Make a hashset and keep adding nodes. when there is node in the hashset return true. Not efficient.
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while (head != null) {
            if (!hs.contains(head))
                hs.add(head);
            else
                return true;
            head = head.next;
        }
        return false;
    }
}
//Another way is to make two pointers where one runs faster than the other if the two meet we return true else return false if either one becomes null.
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
