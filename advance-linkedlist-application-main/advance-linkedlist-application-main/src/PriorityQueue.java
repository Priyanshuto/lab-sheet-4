import java.util.*;

class PriorityQueue {
    private PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
        Comparator.comparingInt(Map.Entry::getKey)
    );

    void insert(int priority, int value) {
       heap.add(new AbstractMap.SimpleEntry<>(priority, value));
   }

   void remove() {
       if (heap.isEmpty()) return;
       heap.poll(); // Remove the highest priority element 
   }

   int top() {
       return heap.isEmpty() ? -1 : heap.peek().getValue();
   }

   boolean isEmpty() {
       return heap.isEmpty(); 
   }
}
