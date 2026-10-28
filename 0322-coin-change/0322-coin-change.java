class Solution {
    public int coinChange(int[] coins, int a) {
        int[] dp = new int[a+1];
        Arrays.fill(dp,a+1);
        dp[0] = 0;
        for(int i=1;i<=a;i++){
            for(int c:coins){
                if(c<=i) dp[i]= Math.min(dp[i],dp[i-c]+1);
            }
        }
        return dp[a] == a+1?-1:dp[a];
    }
}