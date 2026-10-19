class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);

            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}