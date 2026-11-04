class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) map.put(n, map.getOrDefault(n, 0) + 1);
        ArrayList<Integer> l = new ArrayList<>();
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                l.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}