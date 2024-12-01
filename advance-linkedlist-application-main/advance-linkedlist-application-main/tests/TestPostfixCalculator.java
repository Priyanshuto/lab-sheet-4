public class TestPostfixCalculator {
    public static void main(String[] args) {
        PostfixCalculator calculator = new PostfixCalculator();

        System.out.println(calculator.evaluate("5 1 2 + 4 * + 3 -")); // Expected Output: 14
    }
}
