package StackUsingLinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println("Size before pushing: " + myList.getSize());
        System.out.println("Pushing values: ");
        myList.push(8);
        myList.push(10);
        myList.push(17);
        myList.push(32);
        myList.push(46);
        myList.push(90);
        System.out.printf("%-30s %5d \n","Size:" ,myList.getSize());
        System.out.printf("%-30s %5d\n","Peeking the top value:",myList.peek());
        System.out.printf("%-30s %5d\n","Popping the stack:",myList.pop());
        System.out.printf("%-30s %5d\n","Peeking the top value:",myList.peek());
        System.out.printf("%-30s %5d\n","Popping the stack:",myList.pop());
        System.out.printf("%-30s %5d\n","Peeking the top value:",myList.peek());
        System.out.printf("%-30s %5d\n","Final size:",myList.getSize());

    }
}
