import java.util.*;

class CNode {
    int data;
    CNode next;

    CNode(int value) {
        this.data = value;
        this.next = null;
    }
}

class CircularLinkedList {
    private CNode tail;

    CircularLinkedList() {
        this.tail = null;
    }

    void insert(int value) {
        CNode newNode = new CNode(value);
        if (tail == null) {
            tail = newNode;
            tail.next = tail; // Point to itself
        } else {
            newNode.next = tail.next; // New node points to the first node
            tail.next = newNode; // Tail points to the new node
            tail = newNode; // Update tail to the new node
        }
    }

    void traverse() {
        if (tail == null) return;

        CNode current = tail.next; // Start from the first node
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        
        System.out.println();
    }
}
