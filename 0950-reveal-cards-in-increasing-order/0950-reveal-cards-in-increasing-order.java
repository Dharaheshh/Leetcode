class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        for(int i=0;i<deck.length;i++) q.offer(i);
        for(int c:deck){
            int in = q.poll();
            ans[in] = c;
            if(!q.isEmpty()) q.offer(q.poll());
        }
        return ans;
        
    }
}