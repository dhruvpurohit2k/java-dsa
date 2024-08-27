//The trick is to first get the number of the nodes in each list. If we assume that both the list intersect somewhere then that means that there is possiblity the one is longer than another. To fix this we itterate the longer list by the difference in the size of the two list. Then we itterate on both lists together and return the node where both meet.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenOfA = 0;
        int lenOfB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null){
            lenOfA++;
            a=a.next;
        }
        while(b!=null){
            lenOfB++;
            b=b.next;
        }
        while(lenOfA>lenOfB){
            lenOfA--;
            headA = headA.next;
        }
        while(lenOfA<lenOfB){
            lenOfB--;
            headB = headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
