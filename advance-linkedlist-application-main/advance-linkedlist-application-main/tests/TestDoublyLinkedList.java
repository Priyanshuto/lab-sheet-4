public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1);
        list.insert(2);
        list.deleteValue(2);
        list.traverse(); // Expected Output: 1
    }
}
