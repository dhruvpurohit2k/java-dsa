//We first calculate the length of the linked list and divide the length by k to get the number of nodes per element in the array. If we get a fraction we find the modulo to get number of lists which need to have an extra element 
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode[] result = new ListNode[k];
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int check;
        int basePartSize = size / k;
        int remainingPart = size % k;
        for (int i = 0; i < k && head != null; i++) {
            result[i] = head;
            if (remainingPart > 0) {
                check = basePartSize + 1;
            } else
                check = basePartSize;
            for (int j = 1; j < check; j++) {
                head = head.next;
            }
            remainingPart--;
            ListNode prev = head;
            if (head != null) {
                head = head.next;
                prev.next = null;
            }

        }
        return result;
    }
}
