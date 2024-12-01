import java.util.*;

class PostfixCalculator {
    int evaluate(String expression) {
        Stack<Integer> s = new Stack<>();
        Scanner scanner = new Scanner(expression);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) { // If it's a number, push it onto the stack
                s.push(scanner.nextInt());
            } else { // Otherwise, it's an operator
                String token = scanner.next();
                int b = s.pop();
                int a = s.pop();
                
                switch (token) {
                    case "+": s.push(a + b); break;
                    case "-": s.push(a - b); break;
                    case "*": s.push(a * b); break;
                    case "/": s.push(a / b); break; 
                }
            }
        }
        
        return s.peek(); // The result is on top of the stack
    }
}
