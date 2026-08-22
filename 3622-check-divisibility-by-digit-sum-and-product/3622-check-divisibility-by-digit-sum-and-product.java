class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int p = 1;
        int s = 0;
        while(a>0){
            int d = a%10;
            a/=10;
            p *= d;
            s += d;
        }
        return n%(p+s)==0;
    }
}