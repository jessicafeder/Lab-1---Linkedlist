package com.company;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("LinkedList \n~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Current list: " + list); // returnerar inte listan efter implementation
        System.out.println("List size before adding element: " + list.size()); // --> 3

        list.add(0,99);

        System.out.println("List size after adding element: " + list.size()); // --> 4

        System.out.println("Get index 0: " + list.get(0)); // --> 99
        System.out.println("Get index 4: " + list.get(3)); // --> 3

        list.remove(3);

        System.out.println("List size after removing element: " + list.size()); // --> 3
        System.out.println("Returns true if list contains element 3: " + list.contains(3)); // --> returns true
        System.out.println("Returns false as list is not empty: " + list.empty());

        /*QueueMethods queue = new QueueMethods();
        System.out.println("\nQueue\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);

        queue.enqueue(2);
        System.out.println(queue);*/

        StackMethods stack = new StackMethods();
        System.out.println("\nStack\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.push(1);
        stack.push(10);
        stack.push(100);
        System.out.println(stack); // returnerar inte listan efter implementation
        System.out.println("Peek displays the top element: " + stack.peek());
        stack.pop();
        System.out.println("We used pop to remove an element, new top element: " + stack.peek());

    }

}

