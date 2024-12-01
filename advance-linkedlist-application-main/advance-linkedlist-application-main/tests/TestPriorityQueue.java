public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.insert(3, 3);
        pq.insert(1, 1);
        pq.insert(2, 2);
        
        pq.remove();
        
        System.out.println(pq.top()); // Expected Output: 1
    }
}
