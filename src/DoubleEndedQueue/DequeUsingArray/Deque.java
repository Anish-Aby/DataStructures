package DoubleEndedQueue.DequeUsingArray;

import DoubleEndedQueue.DequeIF;

 public class Deque <T> {
    private int size = 0;
    private int head = 0;
    private int tail = 0;
    private int capacity;
    private T[] array;

       public Deque(int capacity){
           this.capacity = capacity;
           array = (T[]) new Object[capacity];
       }

//    @Override
    public int getSize(){ return size;}

//    @Override
    public  boolean isEmpty(){return (size==0);}

//    @Override
    public void addFirst(T data) {
        if(isEmpty()){
            array[0] = data;
            tail++; size++;
        }
        else {
            if(getSize() >= capacity){
                System.out.println("Cannot enter any more elements at the front!");
                System.out.println("Size is: " + getSize());
                return;
            }
            for(int i = tail; i >= 0; i--){
                array[i+1%capacity] = array[i%capacity];
            }
            array[head] = data;
            size++; tail++;
        }
    }

    public void showData(){
           for(T o : array){
               if(o == null) return;
               System.out.println(o);
           }
    }
}
