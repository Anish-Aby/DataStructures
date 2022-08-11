package LinkedList;

public class LinkedList1 {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public LinkedList1(){

    }

    public int size(){
        return size;
    }

    public void insert(int value)  //inseet at the ending of a list
    {

        //if list is empty
        if(head == null && tail == null) emptyListAdd(value);
        else {
            Node newNode = new Node(); // making a new node

            //inserting at the end
            newNode.setValue(value);
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    public void insertAt(int value, int index){
        //when list is empty or out of bounds entered
        if(index >= size) System.out.printf("Please enter a valid index value. The size is %d", size);

        if(head == null && tail == null) emptyListAdd(value);
        else {
            Node newNode = new Node();
            Node tempPtr = head;
            newNode.setValue(value);

            for (int i = 1; i < index; i++) {
                tempPtr = tempPtr.getNext();
            }
            newNode.setNext(tempPtr.getNext());
            tempPtr.setNext(newNode);
            size++;
        }

    }

    public int peekAt(int index){
        Node tempPtr = head;
        for (int i = 0; i < index; i++){
            tempPtr = tempPtr.getNext();
        }

        return tempPtr.getValue();
    }

    public int getLast(){
        return tail.getValue();
    }

    public void insertAtStart(int value){
        if((head == null) && (tail == null)) emptyListAdd(value);
        else{
            Node newNode = new Node();
            newNode.setValue(value);
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public int deleteByValue(int value){
        Node tempPtr = head;
        Node trailingPtr = head;
        int result = 0;
        for(int i = 0; i < size; i++){
            if(tempPtr.getValue() == value){
                if(tempPtr == head){
                    head = tempPtr.getNext();
                    result = tempPtr.getValue();
                    //size -= 1;
                }
                else if(tempPtr == tail){
                    Node ptr = head;
                    for(int j = 0; j < size-1; j++){
                        ptr = ptr.getNext();
                    }
                    tail = ptr;
                    ptr.setNext(null);
                    result = tempPtr.getValue();
                    //size -= 1;
                }
                else {
                    for(int y = 1; y < i; y++){
                        trailingPtr = trailingPtr.getNext();
                    }
                    trailingPtr.setNext(tempPtr.getNext());
                    result = tempPtr.getValue();
                    //size -= 1;
                }
            }
            else
            tempPtr = tempPtr.getNext();
        }
        size--;
        return result;
    }

    public void emptyListAdd(int value){
        Node newNode = new Node();
        head = newNode;
        tail = newNode;
        newNode.setValue(value);
        newNode.setNext(null);
        size++;
    }


}
