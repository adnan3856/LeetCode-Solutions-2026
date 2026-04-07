// Optimised solution as per leetcode submissions    


class MyHashMap {
    class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10007;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        
        // 1. If the bucket is empty, create the first node
        if (buckets[index] == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node curr = buckets[index];
        // 2. If the first node IS the key, update it
        if (curr.key == key) {
            curr.value = value;
            return;
        }

        // 3. Otherwise, walk the list
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.value = value; // Update existing
                return;
            }
            curr = curr.next;
        }
        // 4. If not found, add to the end
        curr.next = new Node(key, value);
    }

    public int get(int key) {
        int index = getIndex(key);
        Node curr = buckets[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Node curr = buckets[index];

        if (curr == null) return;

        // Special Case: If the head node is the one to remove
        if (curr.key == key) {
            buckets[index] = curr.next;
            return;
        }

        // Standard Case: Find the node BEFORE the one to remove
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next; // The Skip
                return;
            }
            curr = curr.next;
        }
    }
}

