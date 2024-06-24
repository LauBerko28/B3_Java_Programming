package day42_a_collection.list;

import java.util.Stack;

public class StackObjects {

    public static void main(String[] args) {

        // hey whenever you want to store your elements, you can store them and i can remove only the one in the top
        // Stack works with LIFO (Last In First Out)

        Stack<Character> stack = new Stack<>();
       // stack.push('a'); its similar to the .add method  --> Push comes from Stack class, and it returns the object that was pushed. what it does is it adds an element on top of the previous one
        //stack.peek(); only shows that is at the top
        //stack.pop(); removes the element that is at the top

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack); // [a, b, c, d]

        System.out.println("Top of my stack: " + stack.peek()); // Top of my stack: d --> I see 'd' because it's the last one i added to the stack

        stack.pop();
        System.out.println(stack); // [a, b, c] --> it removed the element which was at the top

        System.out.println("Top of my stack: " + stack.peek()); // c

        System.out.println(stack.pop()); // removes what was at the top, but since its in the print statement i will see what was removed
        System.out.println(stack); // [a, b]
        System.out.println("Top of my stack: " + stack.peek()); //Top of my stack: b

        //Q: But if I want to remove from bottom. Can I?
        //A: There is a way to do it. But that is not the idea of LIFO
        stack.remove(0); // this will remove the FIRST element added
        System.out.println(stack); // [b]
    }
}
