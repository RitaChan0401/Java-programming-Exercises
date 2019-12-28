package Algorithm;

import Algorithm.ArrayStack;

public class D4_S {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push("Jan.");
        stack.push("Feb.");
        stack.push("Mar.");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("empty" + stack.empty());
    }
}
