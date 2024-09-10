//simply finding gcd and adding it to the list. not efficient
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ori = head;
        while(head!=null){
            ListNode prev = head;
            head = head.next;
            if(head==null) break;
            int mid = getGCD(prev.val,head.val);
            ListNode gcd = new ListNode(mid);
            prev.next = gcd;
            gcd.next = head;
        }
        return ori;
    }

    private int getGCD(int a ,int b){
        int mult = a*b;
        int num1 = a>b?a:b;
        int num2 = a<b?a:b;
        int lcm = 0;
        for(int i = 1;num1<=num2*num1;i++){
            if(num1*i%num2==0){
                lcm = num1*i;
                break;
            }
        }
        return mult/lcm;
    }
}

//Using a faster algo to get gcd
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ori = head;
        while(head!=null){
            ListNode prev = head;
            head = head.next;
            if(head==null) break;
            int mid = getGCD(prev.val,head.val);
            ListNode gcd = new ListNode(mid);
            prev.next = gcd;
            gcd.next = head;
        }
        return ori;
    }

    private int getGCD(int a ,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a =temp;
        }
        return a;
    }
}
