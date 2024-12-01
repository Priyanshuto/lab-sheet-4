public class TestTicketQueue {
    public static void main(String[] args) {
        TicketQueue queue = new TicketQueue();

        queue.enqueue("ticket1");
        queue.enqueue("ticket2");
        
        System.out.println(queue.dequeue()); // Expected Output: ticket1
    }
}
