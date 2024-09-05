//we use the bit shift operator to check if the number is power of 2 or not;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        int num = 1;
        int count = 1;
        while(count<32){
            if(num==n) return true;
            count++;
            num = num<<1;
        }
        return false;
    }
}
