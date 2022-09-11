package circularlyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularlyLinkedList list = new CircularlyLinkedList();
        System.out.println("Size before inserting: " + list.getSize());
        System.out.println("Inserting 1, 2 and so on at the beginning: ");

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        System.out.println("Get first method(should display 3): " + list.getFirst());
        System.out.println("Get last method(should display 1): " + list.getLast());
        System.out.println("Displaying size which sould be 3: " + list.getSize());

    }
}