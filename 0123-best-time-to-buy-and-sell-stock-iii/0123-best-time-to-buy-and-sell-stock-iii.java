class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell = Integer.MIN_VALUE;
        int buyy = Integer.MIN_VALUE;
        int selll = Integer.MIN_VALUE;
        for(int p:prices){
            buy = Math.max(buy,-p);
            sell = Math.max(sell,buy+p);
            buyy = Math.max(buyy,sell-p);
            selll = Math.max(selll,buyy+p);
        }
        return selll;
    }
}