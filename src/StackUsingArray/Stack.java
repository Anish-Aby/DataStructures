package StackUsingArray;

public class Stack {
    private static final int arrsize = 20;
    private static int[] array = new int[arrsize];
    private int size = 0;
    private int top = -1;

    Stack(){}

    public int size(){return size;}

    public Boolean isEmpty(){
        return (size == 0);
    }

    public void push(int value){
        top++;
        array[top] = value;
        size++;
    }

    public int pop(){
        int popElement =  array[top];
        top--;
        size--;
        return popElement;
    }

    public int top(){
        return array[top];
    }

}
