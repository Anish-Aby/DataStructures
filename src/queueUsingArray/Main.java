package queueUsingArray;

public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);
        myArray.enqueue(1);
        myArray.enqueue(2);
        myArray.enqueue(3);
        myArray.enqueue(4);
        myArray.enqueue(5);
        myArray.dequeue();
        myArray.dequeue();
        myArray.enqueue(6);
        myArray.enqueue(7);

        myArray.show();

        System.out.println();

        System.out.println("Peek: "+ myArray.peek());
        System.out.println("Size: " + myArray.getSize());
    }
}
