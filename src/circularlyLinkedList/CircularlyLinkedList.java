package CircularlyLinkedList;

public class CircularlyLinkedList {
    private Node tail = null;
    private int size = 0;

    //methods

    private Boolean isEmpty(){ return size == 0;}

    private Node createNode(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        return newNode;
    }

    public int getSize(){return size;}

    public int getFirst(){
        if (isEmpty()) System.out.println("List is empty!");
        return tail.getNext().getValue();
    }

    public int getLast(){
        if (isEmpty()) System.out.println("List is empty!");
        return tail.getValue();
    }

    public void addFirst(int value){
        if(isEmpty()){
           tail = createNode(value);
           tail.setNext(tail);
           size++;
        }
        else{
            Node newNode = createNode(value);

            Node tempPtr = tail.getNext();
            tail.setNext(newNode);
            newNode.setNext(tempPtr);
            size++;
        }
    }


}
