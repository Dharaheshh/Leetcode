class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        for(int i = n-2;i>-1;i--){
            for(int j=0;j<i+1;j++){
                int a = t.get(i + 1).get(j);
                int b = t.get(i + 1).get(j + 1);
                int min = Math.min(a, b);
                int sum = t.get(i).get(j) + min;
                t.get(i).set(j, sum);
            }
        }
        return t.get(0).get(0);
    }
}