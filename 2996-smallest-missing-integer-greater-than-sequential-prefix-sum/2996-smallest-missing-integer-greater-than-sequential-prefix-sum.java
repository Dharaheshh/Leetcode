class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        boolean[] h = new boolean[1276];
        int ss = nums[0];
        for(int i = 0; i < n; i++){
            h[nums[i]] = true;
        }
        for(int i = 1;
            i < n && nums[i] == nums[i - 1] + 1;
            ss += nums[i++]);
        while(h[ss])
            ss++;
        return ss;
    }
}