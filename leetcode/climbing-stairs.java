//This solution uses the concept of memoization. For a given stair the possible combinations it can have are stored in a hashmap and if we were to reach it again, the cached value is returned;
class Solution {
    public int climbStairs(int n) {
        if(n==1||n==0) return 1;
        Map<Integer,Integer> memo = new HashMap<>();
        return getWays(n,memo);
    }
    int getWays(int n, Map<Integer,Integer> memo){
        if(n==0||n==1) return 1;
        if(!memo.containsKey(n)){
            memo.put(n,getWays(n-1,memo)+getWays(n-2,memo));
        }
        return memo.get(n);
    }

}
