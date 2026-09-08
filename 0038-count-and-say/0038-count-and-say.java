class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++){
            String res = "";
            for(int j=0;j<s.length();j++){
                int c = 1;
                while(j+1<s.length() && s.charAt(j)==s.charAt(j+1)){
                    c++;
                    j++;
                }
                res += c+""+s.charAt(j);
            }
            s = res;
        }
        return s;
    }
}