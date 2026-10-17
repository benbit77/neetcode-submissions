class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);

        for(int i = 0; i < s.length(); i++) {
            char letter = s1.charAt(i);
            int index = t1.indexOf(String.valueOf(letter));
            if(index > - 1) {
                t1.deleteCharAt(index);
            }
            else {
                return false;
            }
        }
        return true;
    }
}