class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] c = new int[n];
        Arrays.fill(c,-1);
        for(int i = 0; i < n; i++) {
            if(c[i]==-1) {
                if(!dfs(graph,i,c)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph, int i, int[] c) {
        //c[i]=0;
        for(int n : graph[i]) {
            if(c[n]== -1) {
                c[n] = 1-c[i];
                boolean che = dfs(graph,n,c);
                if(!che) {
                    return false;
                }
            } else {
                if(c[n] == c[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}