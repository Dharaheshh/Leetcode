class Solution {
    public long minimumSteps(String s) {
        long z = 0;
        long res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') z++;
            else res += z;
        }
        return res;
    }
}