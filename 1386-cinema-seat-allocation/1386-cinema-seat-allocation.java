class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (int[] a, int[] b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int m = reservedSeats.length;
        int ans = 0;
        int count = 0;
        int index = 0;
        while (index < m) {
            boolean[] b = new boolean[11];
            int row = reservedSeats[index][0];
            while (index < m && row == reservedSeats[index][0]) {
                b[reservedSeats[index][1]] = true;
                index++;
            }
            if (!b[2] && !b[3] && !b[4] && !b[5]) {
                ans++;
                b[4] = true;
                b[5] = true;
            }
            if (!b[4] && !b[5] && !b[6] && !b[7]) {
                ans++;
                b[6] = true;
                b[7] = true;
            }
            if (!b[6] && !b[7] && !b[8] && !b[9]) {
                ans++;
            }
            count++;
        }
        ans += 2 * (n - count);
        return ans;
    }
}