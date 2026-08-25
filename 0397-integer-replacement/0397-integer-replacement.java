class Solution {
    public int integerReplacement(long n) {
        int res = 0;
        if(n==1) return 0;
        
        while (n!=1){
            res++;
            if(n%2==0) n/=2;
            else if(n%4==1 || n==3) n--;
            else n++;
        }
        return res;
    }
}