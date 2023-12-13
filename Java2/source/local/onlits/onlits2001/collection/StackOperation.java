package local.onlits.onlits2001.collection;

import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        var list = new Stack<Integer>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        for (int i : list) {
            System.out.println(i);
        }

        list.pop();
        System.out.println("------------------------");

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Item at peek: " + list.peek());
    }
}