//The trick is first convert the time in mins and sort it. The take the diff of adjacent minutes and find the min. At the end before returing the result check for the boundry case when we have 00:00 and 23:59.
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] mins = new int[timePoints.size()];
        for(int i = 0; i<timePoints.size(); i++){
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3));
            mins[i] = h*60+m;
        }
        Arrays.sort(mins);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ;i < mins.length-1; i++){
            ans = Math.min(ans,mins[i+1]-mins[i]);
        }
        return Math.min(ans,24*60-mins[mins.length-1]+mins[0]);
    }
}
