package day42_a_collection.list;

import java.util.Stack;

public class StackObject2 {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(40);
        System.out.println(stack.peek()); // 40
        stack.push(20);
        stack.add(100); // not a proper way of adding items to the stack
        System.out.println(stack); // [40, 20, 100]
        System.out.println(stack.peek()); // 100

        System.out.println(stack.pop()); // 100
        System.out.println(stack); // [40, 20]
        System.out.println(stack.peek()); // 20

    }
}
