class Solution {
    public int reverseDegree(String s) {
        int res = 0,i=1;
        for(char c:s.toCharArray()) res += (26-(c-'a'))*i++;
        return res;
    }
}