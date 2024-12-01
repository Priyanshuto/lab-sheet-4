public class TestCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(1);
        list.insert(2);
        list.traverse(); // Expected Output: 1 2
    }
}
