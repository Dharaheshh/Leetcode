class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n) {
            int s = nums[i];
            while(i < n - 1 && nums[i] + 1 == nums[i + 1]) i++;
            int e = nums[i];
            if(s == e) ans.add(String.valueOf(s));
            else ans.add(s + "->" + e);
            i++;
        }s
        return ans;
    }
}