package com.company;

import org.w3c.dom.Node;

public class ListFunctions {
    private Node head;
    private int listCount;

    public ListFunctions(){
        head = new Node(null);
        listCount = 0;
    }

    /*public class Node{
        protected int value;
        protected Node next;

        public Node(int v){
            this.value = v;
    }

    }*/

    public void add(int v){
        Node linkedTemp = new Node(v);
        Node linkedCurrent = head;
    }
    public void add(int v, int e){

    }

    public void contains(int e){

    }

    public int get(int index){

        if(index < 0)
            return null;

            if(head != null){
                return head.value;
            for(int i = 0; i < index; i++){

            }
            }
            return 1;
        }


    public void remove(int v){


    }

    public void empty(){


    }

    public void size(){

    }


}
