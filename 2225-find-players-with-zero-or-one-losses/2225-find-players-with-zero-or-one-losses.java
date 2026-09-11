class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> win = new ArrayList<>();
        List<Integer> loss1 = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int[] a : matches) {
            int w = a[0];
            int l = a[1];
            m.putIfAbsent(w, 0); //m.put(w,m.getOrDefault(w,0)+0);
            m.put(l,m.getOrDefault(l,0)+1);
        }
        for(int n:m.keySet()){
            if(m.get(n)==0) win.add(n);
            if(m.get(n)==1) loss1.add(n);
        }
        Collections.sort(win);
        Collections.sort(loss1);
        return new ArrayList<>(Arrays.asList(win,loss1));
    }
}