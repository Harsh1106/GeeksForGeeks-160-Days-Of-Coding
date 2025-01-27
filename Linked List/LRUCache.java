import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    static Map<Integer, Integer> cache;
    static int capacity;
    LRUCache(int cap) {
        cache = new LinkedHashMap<>();
        capacity = cap;
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        if(!cache.containsKey(key)) return -1;
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
        return val;
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
            cache.put(key, value);
            return;
        }
        if(cache.size() == capacity){
            int rem = -1;
            for(int i : cache.keySet()){
                rem = i;
                break;
            }
            cache.remove(rem);
        }
        cache.put(key, value);
    }
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);

        // Test cases to validate LRU functionality
        put(1, 10);
        put(2, 20);
        put(3, 30);

        System.out.println("Get key 2: " + get(2)); // Expected output: 20
        System.out.println("Get key 1: " + get(1)); // Expected output: 10

        put(4, 40); // Evicts key 3 (least recently used)
        System.out.println("Get key 3: " + get(3)); // Expected output: -1 (key 3 was evicted)

        put(5, 50); // Evicts key 2 (least recently used)
        System.out.println("Get key 2: " + get(2)); // Expected output: -1 (key 2 was evicted)
        System.out.println("Get key 5: " + get(5)); // Expected output: 50
    }
}
