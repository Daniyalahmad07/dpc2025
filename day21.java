/*Reverse a Stack Using Recursion

You are given a stack of integers, and your task is to write a function that reverses the stack using recursion. You are not allowed to use any additional data structure (like arrays, lists, or another stack). The only operations you are allowed to perform are push, pop, and peek on the stack. The reversal must be done using recursion only.
*/
import java.util.Stack;
public class day21 {
    public static void pushAtBottom(Stack<Integer> s,int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s) {
        if(!s.isEmpty()){
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
        }
        return;
        
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        reverseStack(s);
        System.out.println(s);
    }
}
