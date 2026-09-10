class Solution {
    static boolean[][] vis;
    public boolean containsCycle(char[][] grid) {
        int m = grid.length,n=grid[0].length;
        vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && check(grid,i,j,-1,-1,m,n)) return true;
            }
        }
        return false;
    }
    public boolean check(char[][] a,int i,int j,int x,int y,int m,int n){
        vis[i][j] = true;
        if(i>0 && a[i-1][j]==a[i][j]){
            if(i-1 != x || j!=y){
                if(vis[i-1][j] || check(a,i-1,j,i,j,m,n)) return true;
            }
        }
        if(i<m-1 && a[i+1][j]==a[i][j]){
            if(i+1 != x || j!=y){
                if(vis[i+1][j] || check(a,i+1,j,i,j,m,n)) return true;
            }
        }
        if(j>0 && a[i][j-1]==a[i][j]){
            if(i != x || j-1 !=y){
                if(vis[i][j-1] || check(a,i,j-1,i,j,m,n)) return true;
            }
        }
        if(j<n-1 && a[i][j+1]==a[i][j]){
            if(i != x || j+1 !=y){
                if(vis[i][j+1] || check(a,i,j+1,i,j,m,n)) return true;
            }
        }
        return false;
    }
}