//A slow solution using recurrsion
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        else {
            ListNode node = reverseList(head.next);
            head.next = null;
            ListNode temp = node;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
            return node;
        }
    }
}
//Fast solution using three pointers
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
