//We take the mod 26 of num -1( since we want to add 0 to get a and 25 to get z). Then we divide by 26.
class Solution {
    public String convertToTitle(int num) {
        StringBuilder st=new StringBuilder();
          while(num>0){
            num--;
            int letter = (int)'A' + num%26;
            st.append((char)letter);
            num = num/26;
        }
        return st.reverse().toString();
    }
}
