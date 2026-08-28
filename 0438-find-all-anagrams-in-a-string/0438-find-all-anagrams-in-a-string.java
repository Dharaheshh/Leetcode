class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        int[] freq = new int[26];
        int[] win = new int[26];
        for(int i = 0; i < p.length(); i++) freq[p.charAt(i) - 'a']++;
        for(int i = 0; i < p.length(); i++) win[s.charAt(i) - 'a']++;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= s.length() - p.length(); i++) {
            if(Arrays.equals(freq, win)) ans.add(i);
            win[s.charAt(i) - 'a']--;
            if(i + p.length() < s.length()) win[s.charAt(i + p.length()) - 'a']++;
        }
        return ans;
    }
}