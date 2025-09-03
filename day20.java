/*
Sort a Stack Using Recursion

Given a stack of integers, your task is to write a function that sorts the stack in ascending order. You are not allowed to use any additional data structure like arrays, lists, or another stack. The only operations you are allowed to perform are push, pop, and peek on the stack. The sorting must be performed using recursion only.

You need to recursively sort the stack, ensuring that after the sorting process, the stack remains sorted without using any additional data structures. You can only use the stack's own operations and recursion to solve this problem.
*/
import java.util.Stack;

public class day20 {

    private static void insertSorted(Stack<Integer> stack, int data) {
        if (stack.isEmpty() || stack.peek() <= data) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, data);
        stack.push(top);
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
}
