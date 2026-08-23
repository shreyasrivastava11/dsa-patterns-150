class LRUCache {
    int capacity;
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
            list.add(key);
            return map.get(key);
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key, value);

            list.remove(Integer.valueOf(key));
            list.add(key);

            return;
        }

        if(map.size() == capacity){
            int leastRecentlyUsed = list.get(0);
            list.remove(0);
            map.remove(leastRecentlyUsed);
        }

        map.put(key,value);
        list.add(key);
    }
}
