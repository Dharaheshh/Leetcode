class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int i = 1; i <= 101; i++) {
            boolean flag = false;
            for (int n : nums) {
                if (n == k * i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return k * i;
        }
        return -1;
    }
}