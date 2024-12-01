import java.util.*;

class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private DNode head;

    DoublyLinkedList() {
        this.head = null;
    }

    void insert(int value) {
        DNode newNode = new DNode(value);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void deleteValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DNode current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    void traverse() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
