class Solution {
    public int firstUniqChar(String s) {
        char[] string = s.toCharArray();
        for(int i = 0; i<string.length;i++){
            for(int j = 0; j<string.length;j++){
                if(i!=j&&string[i]==string[j]) break;
                if(j==string.length-1) return i;
            }
        }
        return -1;
    }
}
