class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0,max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[min]) min = i;
            if(nums[i]>nums[max]) max = i;
        }
        int x = Math.min(min,max);
        int y = Math.max(min,max);
        return Math.min(Math.min(y+1,nums.length-x),x+1+nums.length-y);
    }
}