class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for(char c : num.toCharArray()){
            while(!s.isEmpty() && s.peek() > c &&  k > 0){
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k-- > 0) s.pop();
        StringBuilder res = new StringBuilder();
        int i=0;
        for(char c:s) res.append(c);
        while(i<res.length() && res.charAt(i)=='0') i++;
        if(res.length()==i) return "0";
        return res.substring(i);
    }
}