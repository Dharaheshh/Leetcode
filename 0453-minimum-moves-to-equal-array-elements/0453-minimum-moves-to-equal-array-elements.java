class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num:nums) min = Math.min(num,min);
        int move = 0;
        for(int i :nums){
            move += i-min;
        }
        return move;
}
}