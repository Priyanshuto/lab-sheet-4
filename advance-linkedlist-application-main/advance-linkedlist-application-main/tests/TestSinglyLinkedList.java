public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(1);
        list.insert(2);
        list.deleteValue(1);
        list.traverse(); // Expected Output: 2
    }
}
