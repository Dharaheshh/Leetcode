class Solution {
    public int flipgame(int[] f, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < f.length; ++i) if (f[i] == b[i]) set.add(f[i]);
        int res = Integer.MAX_VALUE;
        for(int i=0;i<f.length;i++){
            if (!set.contains(f[i])) res = Math.min(res, f[i]);
            if (!set.contains(b[i])) res = Math.min(res, b[i]);
        }
        return res==Integer.MAX_VALUE ? 0:res;
    }
}