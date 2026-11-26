class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int n = cost.length;
        // int[] dp = new int[n + 1];
        // for (int i = 2; i <= n; i++) dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        // return dp[n];
        int prev = 0;
        int cur = 0;
        for(int i=2;i<=cost.length;i++){
            int sum = Math.min(cur + cost[i-1],prev  + cost[i-2]);
            prev = cur;
            cur = sum;
        }
        return cur;
    }
}