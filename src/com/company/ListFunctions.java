package com.company;


public class ListFunctions {
    private Node head;
    private int listCount;
    private int size;

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
    // inte klat
    public void add(int i, int e) {
        Node n = head;
        head = new Node(e);
        while (i < e) {
            n = n.next;
            i++;
        }
    }
    //inte klar
    public boolean contains(Object o) {
        String e = null;
        while (o==null;e == null){

            if(o==null? e == null : o.equals(e)){
                return true;

            }

        }

       /*
        Node n=head;
        if (n.equals(e)){
            return true;
        }
        return false;*/
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

    public void prettyPrint(){
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