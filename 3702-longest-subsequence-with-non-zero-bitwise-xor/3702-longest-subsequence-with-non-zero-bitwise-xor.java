class Solution {
    public int longestSubsequence(int[] A) {
        int t = 0, n = A.length;
        boolean no = false;
        for (int x : A) {
            no |= x > 0;
            t ^= x;
        }
        if (!no) return 0;
        return t == 0 ? n - 1 : n;
    }
}