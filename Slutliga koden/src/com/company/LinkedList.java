package com.company;

public class LinkedList {
    private Node head;
    private int size;
    private Object Node;


    public class Node {
        protected int value;
        protected Node next;

    public Node(int v) {
        value = v;
        }
    }

    public void add(int e) {
        Node newNode= new Node (e);
        if (head == null) {
            head = newNode;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = newNode;

        }
    }
    public void add(int index, int e) {
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        int i = 0;
        Node n = head;
        while (i < index - 1) {
            n = n.next;
            i++;
        }
        newNode.next = n.next;
        n.next = newNode;
    }
    public boolean contains(int e) {
        Node n = head;
        while (Node!=null) {
            if (n.value == e) {
                return true;
            }
        }       return false;

    }


    public int get(int index) {
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }

     public void remove( int i) {
        if (i==0){
            head = head.next;
            return;
        }
        Node n = head;
        int j = 0;
        while (j < i-1){
            n=n.next;
            j++;
        }
        n.next = n.next.next;
        size --;
    }

    public void prettyprint(){
        System.out.print("LinkedList ->");
        Node n = head;
        while (n != null){
            System.out.print("Node(" + n.value + ") ->");
            n = n.next;

        }
    }
    public boolean empty() {
        return (head == null);
    }
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int i = 1;
            Node n = head;
            while (n.next != null) {
                n = n.next;
                i++;
            }
            return i;
        }
    }

}


