class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i = 0,j=list.size()-1;i<j;i++,j--){
            if(list.get(i)!=list.get(j))
                return false;
        }
        return true;
    }
}
