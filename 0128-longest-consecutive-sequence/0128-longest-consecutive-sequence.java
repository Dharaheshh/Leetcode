class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int n : nums) s.add(n);
        int res = 0;
        for(int n : s){
            if(!s.contains(n-1)){ 
                int cur = n;
                int l = 1;
                while(s.contains(cur+1)){
                    cur++;
                    l++;
                }
                res = Math.max(res,l);
            }
        }
        return res;
    }
}