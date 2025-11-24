class LFUCache {

    class Node {
        int key, value, freq;

        Node(int k, int v) {
            key = k;
            value = v;
            freq = 1;
        }
    }

    private final int capacity;
    private int minFreq = 0;

    private Map<Integer, Node> nodeMap = new HashMap<>();
    private Map<Integer, LinkedHashSet<Node>> freqMap = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!nodeMap.containsKey(key)) return -1;

        Node node = nodeMap.get(key);
        increaseFreq(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            node.value = value;
            increaseFreq(node);
            return;
        }

        if (nodeMap.size() == capacity) {
            evictLFU();
        }

        Node newNode = new Node(key, value);
        nodeMap.put(key, newNode);

        freqMap.computeIfAbsent(1, f -> new LinkedHashSet<>()).add(newNode);
        minFreq = 1;
    }

    private void increaseFreq(Node node) {
        int freq = node.freq;

        freqMap.get(freq).remove(node);
        if (freqMap.get(freq).isEmpty()) {
            freqMap.remove(freq);
            if (freq == minFreq) minFreq++;
        }

        node.freq++;
        freqMap.computeIfAbsent(node.freq, f -> new LinkedHashSet<>()).add(node);
    }

    private void evictLFU() {
        LinkedHashSet<Node> set = freqMap.get(minFreq);
        Node evict = set.iterator().next(); // first = LRU among this freq

        set.remove(evict);
        if (set.isEmpty()) freqMap.remove(minFreq);

        nodeMap.remove(evict.key);
    }
}