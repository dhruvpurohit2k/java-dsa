class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        int sIdx = 0;
        int tIdx = 0;
        while(tIdx<t.length()){
            if(s.charAt(sIdx)==t.charAt(tIdx)){
                sIdx++;
                tIdx++;
            }else{
                tIdx++;
            }
            if(sIdx==s.length()) return true;
        }
        if(sIdx==s.length()) return true;
        else return false;
    }
}
