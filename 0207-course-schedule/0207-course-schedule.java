class Solution {
    public boolean canFinish(int nc, int[][] pq) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0;i<nc;i++) g.add(new ArrayList<>());
        for(int[] p :pq) g.get(p[1]).add(p[0]);
        int[] st= new int[nc];
        for(int i=0;i<nc;i++){
            if(st[i]==0) if(!dfs(g,i,st)) return false;
        } 
        return true;
    }
    public boolean dfs(List<List<Integer>> g,int i,int[] st){
        if(st[i]==1) return false;
        if(st[i]==2) return true;
        st[i] = 1;
        for(int n:g.get(i)){
            if(!dfs(g,n,st)) return false;
        }
        st[i] = 2;
        return true;
    }
}