class Solution {
    public boolean canAliceWin(int n) {
        int ni = 10;
        boolean ans = true;
        while (ni > 0) {
            if (n < ni) return !ans;
            n -= ni;
            ni--;
            ans = !ans;
        }
        return !ans;
    }
}