package com.company;

public class StackMethods extends LinkedList{



    public void push(int i){
        add(i);
    }

    public int pop(){
        int temp = get(size()-1);
        remove(size()-1);
        return temp;
    }

    public int peek(){
        return get(size()-1);
    }
}
