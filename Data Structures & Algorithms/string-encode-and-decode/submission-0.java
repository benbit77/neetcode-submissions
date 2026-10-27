class Solution {

    public String encode(List<String> strs) {
        String str = "";

        for (String s : strs) {
            str = str + s.length() + "#" + s;
        }

        return str;
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int n = Integer.parseInt(str.substring(i, j));
            strs.add(str.substring(j + 1, j + 1 + n));
            i = j + 1 + n;
        }

        return strs;
    }
}
