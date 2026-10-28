class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        int productNoZero = 1;
        int zeroCount = 0;
        for (int n : nums) {
            product *= n;
            if (n != 0) {
                productNoZero *= n;
            } else {
                zeroCount++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                if (zeroCount == 1) {
                    output[j] = productNoZero;
                } else {
                    output[j] = 0;
                }
            }
            else {
                output[j] = product / nums[j];
            }
        }

        return output;
    }
}  
