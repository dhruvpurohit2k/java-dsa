class Solution {
    public boolean wordPattern(String pattern, String s) {
        List<String> words = new ArrayList<String>();
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(s.substring(j, i));
                j = i + 1;
            } else if (i == s.length() - 1) {
                words.add(s.substring(j, i + 1));
            }
        }

        if (words.size() != pattern.length())
            return false;
        for (int i = 0; i < words.size(); i++) {
            char c = pattern.charAt(i);
            String word = words.get(i);
            if (!map.containsKey(c) && !map.containsValue(word)) {
                map.put(c, word);
            } else {
                if (map.getOrDefault(c, "").equals(word))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}
