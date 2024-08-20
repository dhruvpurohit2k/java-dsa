//Find the sqrt of x. !!Very inefficient
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        for(long i = 2; i<=x;i++){
            if(i*i == x) return (int)i;
            if(i*i > x) return (int)i-1;
        }
        return 0;
    }
}
//This is a much more efficient code which utilises the concept of binary search to get to logn time
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int low = 1;
        int high = x;
        int mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if ((long) mid * mid > (long) x) {
                high = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}
