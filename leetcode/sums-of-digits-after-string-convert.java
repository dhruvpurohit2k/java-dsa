class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            int number = s.charAt(i) - 'a' +1; 
            sb.append(Integer.toString(number)); 
        }
        int sum = 0;
        while(k>0){
            sum=0;
            for(int i = 0;i<sb.length();i++){
                int number = sb.charAt(i) - '0';
                sum+=number; 
            }
            sb.setLength(0);
            sb.append(Integer.toString(sum));
            k--;
        }
        return sum;
    }
}
