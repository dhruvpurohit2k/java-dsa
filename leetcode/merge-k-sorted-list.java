class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i<lists.length; i++){
            while(lists[i]!=null){
                q.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        if(q.size()==0) return null;
        ListNode head = new ListNode(q.poll());
        ListNode temp = head;
        while(!q.isEmpty()){
            temp.next = new ListNode(q.poll());
            temp = temp.next;
        }
        return head;
    }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists==null||lists.length==0) return null;
       while(lists.length>1){
            List<ListNode> temp = new ArrayList<>();
            for(int i = 0; i<lists.length; i+=2){
                ListNode n1 = lists[i];
                ListNode n2 = i+1<lists.length?lists[i+1]:null;
                temp.add(mergeNodes(n1,n2));
            }
            lists = temp.toArray(new ListNode[temp.size()]);
       }
       return lists[0];
    }
    private ListNode mergeNodes(ListNode n1, ListNode n2){
        ListNode head = new ListNode();
        ListNode ans = head;
        while(n1!=null&&n2!=null){
            if(n1.val>n2.val){
                head.next= n2;
                n2=n2.next;
            }else{
                head.next=n1;
                n1=n1.next;
            }
            head=head.next;
        }
        head.next = n1!=null?n1:n2;
        return ans.next;
    }
}
