//We create a hashmap add the char of string s as the keys and char of string t as its values.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> mapping = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!mapping.containsKey(s.charAt(i))&&!mapping.containsValue(t.charAt(i)))
                mapping.put(s.charAt(i),t.charAt(i));
            else if(mapping.getOrDefault(s.charAt(i),' ')==t.charAt(i)) continue;
            else return false;
        }
        return true;

    }
}
