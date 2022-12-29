package local.onlits.onlits2001.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        try {
            stack.push(10);
            System.out.println(stack.peek());
            stack.push(20);
            System.out.println(stack.peek());
            stack.pop();
            System.out.println(stack.peek());
            stack.pop();
            System.out.println(stack.peek());
        } catch (EmptyStackException ex) {
            System.out.println("Stack Empty!");
        }

        System.out.println("Reached end of program!");
    }
}