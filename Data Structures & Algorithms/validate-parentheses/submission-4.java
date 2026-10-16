class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> seen = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                seen.add(s.charAt(i));
            }
            else if(seen.isEmpty()) {
                return false;
            }
            else if(s.charAt(i) == ')') {
                if(seen.get(seen.size() - 1) == '(') {
                    seen.remove(seen.size() - 1);
                }
                else {
                    return false;
                }
            }
            else if(s.charAt(i) == '}') {
                if(seen.get(seen.size() - 1) == '{') {
                    seen.remove(seen.size() - 1);
                }
                else {
                    return false;
                }
            }
            else if(s.charAt(i) == ']') {
                if(seen.get(seen.size() - 1) == '[') {
                    seen.remove(seen.size() - 1);
                }
                else {
                    return false;
                }
            }
        }
        if(!seen.isEmpty()) {
            return false;
        }
        return true;
    }
}