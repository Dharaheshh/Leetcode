class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int k = 0;
        for (int d = 0; d < m + n - 1; d++) {
            List<Integer> dia = new ArrayList<>();
            int row, col;
            if (d < n) row = 0;
            else row = d - n + 1;
            if (d < n) col = d;
            else col = n - 1;
            while (row < m && col >= 0) {
                dia.add(mat[row][col]);
                row++;
                col--;
            }
            if (d % 2 == 0) {
                Collections.reverse(dia);
            }
            for (int x : dia) {
                ans[k++] = x;
            }
        }
        return ans;
    }
}