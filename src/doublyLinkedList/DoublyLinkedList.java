package doublyLinkedList;

public class DoublyLinkedList {
    private Node header;
    private Node trailer;
    private int size = 0;

    private Node createNode(int value){
        Node newNode = new Node();
        newNode.setValue(value);
        return newNode;
    }

    public DoublyLinkedList(){
        header = new Node(null, null);
        trailer = new Node(null, header);
        header.setNext(trailer);
    }

    public int getSize(){return size;}

    public Boolean isEmpty(){
        if (trailer.getPrev() == header)
            return true;
        else
            return false;
    }

    public int peekFirst(){
        int value = header.getNext().getValue();
        return value;
    }

    public int peekLast(){
        int value = trailer.getPrev().getValue();
        return value;
    }

    public void addFirst(int value){
        Node newNode = createNode(value);
        newNode.setNext(header.getNext());
        newNode.setPrev(header);
        header.getNext().setPrev(newNode);
        header.setNext(newNode);
    }

    public void addLast(int value){
        Node newNode = createNode(value);
        newNode.setNext(trailer);
        newNode.setPrev(trailer.getPrev());
        trailer.getNext().setNext(newNode);
        trailer.setPrev(newNode);
    }

    public void removeFirst(){
        header.getNext().getNext().setPrev(header);
        header.setNext(header.getNext().getNext());
    }

    public void removeLast(){
        trailer.getPrev().getPrev().setNext(trailer);
        trailer.setPrev(trailer.getPrev().getPrev());
    }
}
