package stack;
import java.util.Stack;
// t and S complexity=O(1) and O(1)

public class minStack {
    public Stack<Integer> s = new Stack<>();
    public Stack<Integer> sMin = new Stack<>();

    public void push(int val) {
        s.push(val);
        if (sMin.isEmpty() || val <= sMin.peek()) {
            sMin.push(val);
        }
    }

    public void pop() {
        if (!s.isEmpty()) {
            int popped = s.pop(); // popped = -3
            if (popped == sMin.peek()) { // -3 == -3 (true)
                sMin.pop(); // Remove top element from sMin
            }
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return sMin.peek();
    }

}

class Main {
    public static void main(String[] args) {
        minStack minStack = new minStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);


        System.out.println("Top element: " + minStack.top()); // Output: -3
        System.out.println("Minimum element: " + minStack.getMin()); // Output: -3

        minStack.pop();
        System.out.println("After popping, top element: " + minStack.top()); // Output: 0
        System.out.println("After popping, minimum element: " + minStack.getMin()); // Output: -2
    }
}
