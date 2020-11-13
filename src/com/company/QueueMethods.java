package com.company;

public class QueueMethods extends ListFunctions {
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
