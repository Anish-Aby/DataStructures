package queueUsingLinkedList;

public class LinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    LinkedList(){}

    public int getSize(){ return size;}

    public void enqueue(int data){
        if(tail == null && head == null){
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(null);
            head = tail = newNode;
        }
        else{
            Node newNode = new Node(data);
            tail.setNext(newNode);
            tail = newNode;
            newNode.setNext(null);
        }
        size++;
    }

    public int dequeue(){
        int result = 0;
        if(head == null && tail == null) System.out.println("Nothing for dequeue.");
        else{
            result = head.getData();
            head = head.getNext();
            size--;
        }
        return result;
    }

    public void show(){
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public int peek(){
        return head.getData();
    }
}
