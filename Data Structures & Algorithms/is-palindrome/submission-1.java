class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlnum(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlnum(s.charAt(right))) {
                right--;
            }

            int a = s.charAt(left);
            int b = s.charAt(right);

            if (a >= 65 && a <= 90) a += 32;
            if (b >= 65 && b <= 90) b += 32;

            if (a != b) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlnum(int c) {
        return (c >= 48 && c <= 57)
            || (c >= 65 && c <= 90)
            || (c >= 97 && c <= 122);
    }
}