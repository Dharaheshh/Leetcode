class Solution {
    public int findCircleNum(int[][] ic) {
        boolean[] vis = new boolean[ic.length];
        int res = 0;
        for(int i = 0; i < ic.length; i++) {
            if(!vis[i]) {
                res++;
                dfs(ic,vis,i);
            }
        }
        return res;
    }
    public void dfs(int[][] ic, boolean[] vis, int i) {
        vis[i] = true;
        for(int j = 0; j < ic.length; j++) {
            if(ic[i][j] == 1 && !vis[j]) {
                dfs(ic, vis, j);
            }
        }   
        return;
    }
}