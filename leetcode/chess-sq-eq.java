//when the x and y coordinates are both even or odd at the same time we get black if they are opposite then we get white.
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1x = coordinate1.charAt(0) - 'a' + 1;
        int c1y = coordinate1.charAt(1) - '0';
        int c2x = coordinate2.charAt(0) - 'a' + 1;
        int c2y = coordinate2.charAt(1) - '0';

        boolean color1= c1x%2!=c2x%2?true:false;
        boolean color2= c1y%2!=c2y%2?true:false;

        return color1==color2;
    }
}
