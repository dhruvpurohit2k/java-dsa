//Simply get the alphabet number and add it to a sum. If there is another variable we first multiply by 26 and then add it. 
class Solution {
    public int titleToNumber(String columnTitle) {
        int letter = 0;
        for (int i = 0; i <columnTitle.length(); i++) {
            letter = letter*26;
            letter += (int) columnTitle.charAt(i) - (int) 'A' +1;

        }
        return letter;
    }
}
