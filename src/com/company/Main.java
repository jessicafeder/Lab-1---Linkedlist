package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.insert(l, 1);
        l.insert(l, 2);
        l.insert(l, 3);

        System.out.println("LinkedList \n~~~~~~~~~~~~~~~~~~~~~~~~~");
        l.printList(l);
        System.out.println("\nList size before adding element: " + l.size()); // --> 3

        l.add(0,99);

        System.out.println("List size after adding element: " + l.size()); // --> 4

        System.out.println("Get index 0: " + l.get(0)); // --> 99
        System.out.println("Get index 4: " + l.get(3)); // --> 3

        l.remove(3);

        System.out.println("List size after removing element: " + l.size()); // --> 3
        System.out.println("Returns true if list contains element 3: " + l.contains(3)); // --> returns true
        System.out.println("Returns false as list is not empty: " + l.empty());

        QueueMethods queue = new QueueMethods();
        System.out.println("\nQueue\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.print("Current list: ");
        QueueMethods.printListQueue(queue);
        queue.enqueue(2);
        System.out.print("\nEnqueue: ");
        QueueMethods.printListQueue(queue);
        queue.dequeue();
        System.out.print("\nDequeue: ");
        QueueMethods.printListQueue(queue);
        queue.peek();
        System.out.print("\nPeek: ");
        QueueMethods.printListQueue(queue);

        StackMethods stack = new StackMethods();
        System.out.println("\n \nStack\n~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.push(1);
        stack.push(10);
        stack.push(100);
        StackMethods.printList(stack);
        //System.out.println(stack); // returnerar inte listan efter implementation
        System.out.println("\nPeek displays the top element: " + stack.peek());
        stack.pop();
        System.out.println("We used pop to remove an element, new top element: " + stack.peek());

    }

}

