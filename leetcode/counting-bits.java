class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i<=n;i++){
            result[i] = bitCount(i);
        }
        return result;
    }
    public int bitCount(int n){
        int count = 0;
        while(n>0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
}
