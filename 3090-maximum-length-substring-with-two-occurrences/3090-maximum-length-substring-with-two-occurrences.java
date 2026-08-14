class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0,r=0,res=0;
        int[] f = new int[26];
        while(r<s.length()){
            f[s.charAt(r)-'a']++;
            while(f[s.charAt(r)-'a']>2){
                f[s.charAt(l)-'a']--;
                l++;
            }
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}