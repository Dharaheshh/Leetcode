class Solution {
    public int reachNumber(int target) {
        int n =0;
        target = Math.abs(target);
        int res = 0;
        while(n<target || (target-n)%2!=0){
            res++;
            n+=res;
        }
        return res;
    }
}