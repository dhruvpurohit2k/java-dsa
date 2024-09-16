//Firs we Create an array of size 32 since we got 5 vowels and there of 31 combinations of them possible.
//The each index in that array keeps track of the odd index of a vowel. i.e when we encounter an e for example the pointer of that array goes to 2 and at 2 we place the index of that e. In next itteration we simply keep 
//on moving forward and if we encounter another e we fall back to 0.
class Solution {
    public int findTheLongestSubstring(String s) {
        int[] map = new int[32];
        Arrays.fill(map,-2);
        map[0] = -1;

        int maxLen = 0;
        int mask = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            switch(ch) {
                case 'a':
                    mask^=1;
                    break;
                case 'e':
                    mask^=2;
                    break;
                case 'i':
                    mask^=4;
                    break;
                case 'o':
                    mask^=8;
                    break;
                case 'u':
                    mask^=16;
                    break;
            }
            int prev = map[mask];
            if(prev==-2){
                map[mask] = i;
            }else{
                maxLen = Math.max(maxLen,i-prev);
            }
        }
        return maxLen;
    }
}
