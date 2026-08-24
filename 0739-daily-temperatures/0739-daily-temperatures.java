class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        // for(int i=t.length-1;i>=0;i--){
        //     while(!s.isEmpty() && t[s.peek()] < t[i]) s.pop();
        //     if(s.isEmpty()) ans[i] = 0;
        //     else ans[i] = s.peek() - i;
        //     s.push(i);
        // }
        // return ans;
        for(int i=0;i<t.length;i++){
            while(!s.isEmpty() && t[s.peek()] < t[i]){
                int prev = s.pop();
                ans[prev] = i-prev;
            }
            s.push(i);
        }
        return ans;
    }
}