package StackUsingLinkedList;

public class LinkedList {
    private Node top = null;
    private int size = 0;

    public int getSize(){return size;}

    public Boolean isEmpty(){return (top == null);}

    public void push(int value){
        if(top == null){
            top = new Node(value);
            size++;
        }
        else{
            Node newNode = new Node(value);
            newNode.setNext(top);
            top = newNode;
            size++;
        }
    }

    public int pop(){
        int poppedValue = top.getValue();
        top = top.getNext();
        size--;
        return poppedValue;

    }

    public int peek(){
        return top.getValue();
    }
}
