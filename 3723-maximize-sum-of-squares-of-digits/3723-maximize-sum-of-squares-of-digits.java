class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9*num) return "";
        StringBuilder ans = new StringBuilder();
        int nn = sum / 9;
        for (int i = 0; i < nn; i++)  ans.append('9');
        int re = sum % 9;
        if (re > 0) ans.append((char) ('0' +re));
        int zeros = num - ans.length();
        for (int i = 0; i < zeros; i++) ans.append('0');
        return ans.toString();
    }
}