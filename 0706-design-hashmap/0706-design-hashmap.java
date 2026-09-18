class MyHashMap {
        int[] d;
    public MyHashMap() {
        d = new int[10000000];Arrays.fill(d, -1);
    }
    
    public void put(int key, int value) {
        d[key] = value;
    }
    
    public int get(int key) {
        return d[key];
    }
    
    public void remove(int key) {
        d[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */