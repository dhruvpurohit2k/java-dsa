//A number which has its primes as 2 3 or 5 is divisble by it so we keep on dividing. if after dividing we come across a number which is not divisible by 2 3 or 5 that means that it is multiple of another prime and we return false;
class Solution {
    public boolean isUgly(int n) {
        if(n==0) return false;
        if(n<=3&&n>0) return true;
        if(n%2==0) return isUgly(n/2);
        if(n%3==0) return isUgly(n/3);
        if(n%5==0) return isUgly(n/5);
        return false;
    }
}
