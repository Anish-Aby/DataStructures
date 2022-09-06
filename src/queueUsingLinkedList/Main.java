package QueueUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println("Size: " + myList.getSize());
        myList.enqueue(5);
        myList.enqueue(23);
        myList.enqueue(2);
        myList.enqueue(8);
        myList.enqueue(10);
        myList.show();
        System.out.println("First ele: " + myList.peek());
        System.out.println("Size: " + myList.getSize());
        System.out.println("Dequeue: " + myList.dequeue());
        System.out.println("Dequeue: " + myList.dequeue());
        System.out.println("Dequeue: " + myList.dequeue());
        System.out.println("First ele: " + myList.peek());
    }
}
