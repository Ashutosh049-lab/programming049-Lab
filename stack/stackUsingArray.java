package stack;
import java.util.*;



public class stackUsingArray {
    int arr[];
    int top;
    int capacity;

    public stackUsingArray(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the stack: ");
            int size = scanner.nextInt();
            stackUsingArray stack = new stackUsingArray(size);

            while (true) {
                System.out.println("\nStack Operations:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top");
                System.out.println("4. Size");
                System.out.println("5. Is Empty");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter element to push: ");
                        int elementPush = scanner.nextInt();
                        stack.push(elementPush);
                        break;
                    case 2:
                        int poppedElement = stack.pop();
                        if (poppedElement != Integer.MIN_VALUE) {
                            System.out.println("Popped Element: " + poppedElement);
                        }
                        break;
                    case 3:
                        int topElement = stack.top();
                        if (topElement != Integer.MIN_VALUE) {
                            System.out.println("Top Element: " + topElement);
                        }
                        break;
                    case 4:
                        System.out.println("Size of the stack: " + stack.size());
                        break;
                    case 5:
                        System.out.println("Is Stack Empty: " + stack.isEmpty());
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            }
        }
    }


