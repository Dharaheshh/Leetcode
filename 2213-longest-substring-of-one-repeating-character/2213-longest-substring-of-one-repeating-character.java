class Solution {
    char[] arr;
    int n;
    int[] prefLen, sufLen, maxLen, segLen;
    char[] leftChar, rightChar;
    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        n = s.length();
        arr = s.toCharArray();
        prefLen = new int[4 * n];
        sufLen  = new int[4 * n];
        maxLen  = new int[4 * n];
        segLen  = new int[4 * n];
        leftChar  = new char[4 * n];
        rightChar = new char[4 * n];
        build(1, 0, n - 1);
        int k = queryCharacters.length();
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int idx = queryIndices[i];
            char c = queryCharacters.charAt(i);
            arr[idx] = c;
            update(1, 0, n - 1, idx, c);
            res[i] = maxLen[1];
        }
        return res;
    }
    private void build(int node, int l, int r) {
        if (l == r) {
            segLen[node] = prefLen[node] = sufLen[node] = maxLen[node] = 1;
            leftChar[node] = rightChar[node] = arr[l];
            return;
        }
        int mid = (l + r) >>> 1;
        build(2 * node, l, mid);
        build(2 * node + 1, mid + 1, r);
        merge(node, 2 * node, 2 * node + 1);
    }
    private void update(int node, int l, int r, int idx, char c) {
        if (l == r) {
            leftChar[node] = rightChar[node] = c;
            return; 
        }
        int mid = (l + r) >>> 1;
        if (idx <= mid) update(2 * node, l, mid, idx, c);
        else update(2 * node + 1, mid + 1, r, idx, c);
        merge(node, 2 * node, 2 * node + 1);
    }
    private void merge(int node, int left, int right) {
        segLen[node] = segLen[left] + segLen[right];
        leftChar[node]  = leftChar[left];
        rightChar[node] = rightChar[right];
        prefLen[node] = prefLen[left];
        if (prefLen[left] == segLen[left] && rightChar[left] == leftChar[right]) {
            prefLen[node] += prefLen[right];
        }
        sufLen[node] = sufLen[right];
        if (sufLen[right] == segLen[right] && rightChar[left] == leftChar[right]) {
            sufLen[node] += sufLen[left];
        }
        maxLen[node] = Math.max(maxLen[left], maxLen[right]);
        if (rightChar[left] == leftChar[right]) {
            maxLen[node] = Math.max(maxLen[node], sufLen[left] + prefLen[right]);
        }
    }
}