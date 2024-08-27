class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches("[A-Za-z0-9]"))
                sb.append(s.substring(i, i + 1).toLowerCase());
        }
        if (sb.length() <= 1)
            return true;
        for (int i = 0, j = sb.length() - 1; i < sb.length() / 2; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j))
                return false;
        }
        return true;
    }
}
