class Solution {
    public void sortColors(int[] nums) {
        int r = 0;
        int w = 0;
        int b = nums.length - 1;
        while (w <= b) {
            if (nums[w] == 1) w++;
            else if (nums[w] == 0) {
                swap(nums, r, w);
                r++;
                w++;
            }
            else {
                swap(nums, b, w);
                b--;
            }
        }
    }

    public void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}