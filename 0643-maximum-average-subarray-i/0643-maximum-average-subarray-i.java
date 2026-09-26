class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        int l = 0;
        for (int r = k; r < nums.length; r++) {
            sum = sum - nums[l] + nums[r];
            l++;
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}