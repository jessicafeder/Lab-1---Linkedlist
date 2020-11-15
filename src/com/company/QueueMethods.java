package com.company;

public class QueueMethods extends LinkedList {

    public static void printListQueue (QueueMethods list){
        Node currNode = list.head;
        System.out.print("");

        while (currNode != null){
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
    }

    public void enqueue(int i) {
        add(i);
    }

    public int dequeue() {
        int temp = get(0);
        remove(0);
        return temp;
    }

    public int peek() {

        return get(0);
    }


}
