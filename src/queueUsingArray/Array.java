package queueUsingArray;

public class Array {
    private int data;
    private int front = 0;
    private int size = 0;
    private int rear = 0;
    int[] array;
    Array (int size){
        this.array = new int[size];
    }

    public int getSize(){
        return size;
    }
    public void enqueue(int data){
        array[(rear% array.length)] = data;
        rear++;
        size++;
    }

    public int dequeue(){
        int result = array[(front%array.length)];
        front++;
        size--;
        return result;
    }

    public void show(){
        for(int i = 0; i < size; i++)
            System.out.print(array[(i%array.length)]+ " ");
    }

    public int peek(){
        return array[front];
    }

}
