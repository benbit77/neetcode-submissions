class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[] = new int[2];
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (values.contains(value)) {
                return new int[]{values.indexOf(value), i};
            }
            values.add(nums[i]);
        }
        
        return new int[]{0, 1};
        
    }
}