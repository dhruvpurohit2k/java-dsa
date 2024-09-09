class Solution {
    public int addDigits(int num) {
     int sum = 0, current;
     while(num/10!=0){
        sum = 0;
        current = num;
        while(current!=0){
            sum+=current%10;
            current/=10;
        }
        num = sum;
     }
     return num;   
    }
}

