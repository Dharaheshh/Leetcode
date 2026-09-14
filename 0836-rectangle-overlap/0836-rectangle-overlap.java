class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        int l = Math.max(r1[0], r2[0]);
        int r = Math.min(r1[2], r2[2]);
        int b = Math.max(r1[1], r2[1]);
        int t = Math.min(r1[3], r2[3]);
        return l < r && b < t;
    }
}