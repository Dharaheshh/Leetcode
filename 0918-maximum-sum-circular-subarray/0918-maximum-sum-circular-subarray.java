class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,curmax = 0,curmin=0,t=0;
        for(int n:nums){
            t += n;
            curmax = Math.max(n,curmax+n);
            max = Math.max(max,curmax);
            curmin = Math.min(n,curmin+n);
            min = Math.min(min,curmin);
        }
        return max<0?max:Math.max(max,t-min);
    }
}