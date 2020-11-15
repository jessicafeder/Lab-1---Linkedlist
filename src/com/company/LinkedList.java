package com.company;

public class LinkedList {
    Node head;
    Object Node;
    int size;


    static class Node {
        int value;
        Node next;

        Node(int v) {
            next = null;
            this.value = v;
        }
    }

    public static LinkedList insert (LinkedList list, int value){
        Node newNode = new Node(value);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        } else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList (LinkedList list){
        Node currNode = list.head;
        System.out.print("Current list: ");

        while (currNode != null){
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
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

    /*public void prettyPrint(){
        System.out.print("LinkedList ->");
        Node n = head;
        while (n != null){
            System.out.print("Node(" + n.value + ") ->");
            n = n.next;

        }
    }*/
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
