class Solution {
    public void reverseString(char[] s) {
        int n = 0;
        while(n<s.length/2){
            char temp = s[n];
            s[n] = s[s.length-1-n];
            s[s.length-1-n] = temp; 
            n++;
        }
    }
}
