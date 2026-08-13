class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int pmax = nums[0];
        int pmin = nums[0];
        for(int i = 1;i<nums.length;i++){
            int n = nums[i];            
            int temp = pmax;
            pmax = Math.max(n,Math.max(pmax*n,pmin*n));
            pmin = Math.min(n,Math.min(temp*n,pmin*n));
            res = Math.max(res,pmax);
        }
        return res;
    }
}