package circularlyLinkedList;

public class Node {
    private int value;
    private Node next;

    public Node(){

    }

    public Node(int value, Node next){
        this.value = value ;
        this.next = next;
    }

    void setValue(int value){this.value = value;}

    void setNext(Node next){this.next = next;}

    int getValue(){ return value;}

    Node getNext(){return next;}
}
