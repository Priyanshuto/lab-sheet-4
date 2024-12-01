import java.util.*;

class TicketQueue {
    private Queue<String> tickets = new LinkedList<>();

    void enqueue(String ticket) {
        tickets.add(ticket);
    }

    String dequeue() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets in the queue");
            return "";
        }
        
        return tickets.poll(); 
    }

    boolean isEmpty() {
       return tickets.isEmpty(); 
   }
}
