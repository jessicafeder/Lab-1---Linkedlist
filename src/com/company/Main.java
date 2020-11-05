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

        System.out.println("LinkedList \n~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Current list: " + list);
        System.out.println("List size before adding element: " + list.size()); // --> 5

        list.add(0,2);

        System.out.println("List size after adding element: " + list.size()); // --> 6

        System.out.println("Get index 0: " + list.get(0)); // --> 2
        System.out.println("Get index 4: " + list.get(4)); // --> 6

        list.remove(5);

        System.out.println("List size after removing element: " + list.size()); // --> 5
        System.out.println("Returns true if list contains element 3: " + list.contains(3)); // --> returns true

        Stack <Integer> stack = new Stack<>();
        System.out.println("\nStack\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.push(1);
        stack.push(10);
        stack.push(100);
        System.out.println(stack);
        System.out.println("Peek displays the top element: " + stack.peek());
        stack.pop();
        System.out.println("We used pop to remove an element, new top element: " + stack.peek());
    }

}

