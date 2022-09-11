package doubleEndedQueue.DequeUsingArray;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> myDeque = new Deque<>(10);
        System.out.println("Is it empty: " + myDeque.isEmpty());
        System.out.println("Size: " + myDeque.getSize());
        System.out.println("Adding first");
        myDeque.addFirst(6);
        myDeque.addFirst(8);
        myDeque.addFirst(30);
        myDeque.addFirst(7);
        myDeque.showData();
    }
}
