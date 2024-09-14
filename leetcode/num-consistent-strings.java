We use hash set to speed up looking up.
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean contains = true;
        int consistentStrings = 0;
        HashSet<Character> allowedSet= new HashSet<>();
        for(char character : allowed.toCharArray()){
            allowedSet.add(character);
        }
        for(String word : words){
            contains=true;
            for(int i = 0;i<word.length();i++){
                if(!allowedSet.contains(word.charAt(i))){
                    contains = false;
                    break;
                }
                
            }
            if(contains==true) consistentStrings++;
        }
        return consistentStrings;
    }
}
