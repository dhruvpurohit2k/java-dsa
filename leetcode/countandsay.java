class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<s.length()){
            char ch = s.charAt(i);
            int counter = 0;
            while(i<s.length()&&ch==s.charAt(i)){
                counter++;
                i++;
            }
            i--;
            String count = Integer.toString(counter);
            sb.append(count);
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}
