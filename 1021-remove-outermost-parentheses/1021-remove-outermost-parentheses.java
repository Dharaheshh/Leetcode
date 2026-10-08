class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (c > 0) ans.append(ch);
                c++;
            } else {
                c--;
                if (c > 0) ans.append(ch);
            }
        }
        return ans.toString();
    }
}