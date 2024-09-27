We use binary search to find the sq. If we fing a sq we return true else we return false.
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0) return true;
        int left = 2;
        int right = num/2;
        while(left<=right){
            int mid = (right+left)/2;
            if(mid==num/mid && num%mid==0) return true;
            else if(mid<num/mid) left=mid+1;
            else right = mid-1;
        }

        return false;
        
    }
