package stackUsingLinkedList;

public class Node {
    private int value;
    private Node next;

    Node(){}

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    Node(int value){
        this.value = value;
    }

    public int getValue() {return value;}

    public Node getNext() {return next;}

    public void setValue(int value) {this.value = value;}

    public void setNext(Node next){this.next = next;}
}
