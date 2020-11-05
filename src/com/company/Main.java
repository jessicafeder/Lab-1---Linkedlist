package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);

        System.out.println(list.size()); // --> 5

        list.add(0,2);

        System.out.println(list.size()); // --> 6

        System.out.println(list.get(0)); // --> 2
        System.out.println(list.get(4)); // --> 6

        list.remove(5);

        System.out.println(list.size()); // --> 5
        System.out.println(list.contains(3)); // --> returns true

        Stack <Integer> stack = new Stack<>();
        System.out.println("Stack ");
        stack.push(1);
        stack.push(10);
        stack.push(100);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }

}

