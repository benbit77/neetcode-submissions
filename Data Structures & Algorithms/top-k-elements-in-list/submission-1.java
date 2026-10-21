class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] groups = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> values : count.entrySet()) {
            int x = values.getValue();
            if (groups[x] == null) {
                groups[x] = new ArrayList<>();
            }
            groups[x].add(values.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = groups.length - 1; i >= 0 && index < k; i--) {
            if(groups[i] != null) {
                for(int n : groups[i]) {
                    result[index] = n;
                    index++;
                    if(index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}