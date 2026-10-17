class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);

        for(int i = 0; i < s.length(); i++) {
            if(t1.indexOf(String.valueOf(s1.charAt(i))) > - 1) {
                t1.deleteCharAt(t1.indexOf(String.valueOf(s1.charAt(i))));
            }
            else {
                return false;
            }
        }
        return true;
    }
}