class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int i = 1; i <= 101; i++) {
            boolean found = false;
            for (int n : nums) {
                if (n == k * i) {
                    found = true;
                    break;
                }
            }
            if (!found) return k * i;
        }
        return -1;
    }
}