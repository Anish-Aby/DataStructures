package StackUsingArray;

public class main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println("Size at start: " + myStack.size());
        System.out.println("Is empty? :" + myStack.isEmpty());
        System.out.println("Pushing elements");
        myStack.push(10);
        myStack.push(8);
        myStack.push(17);
        myStack.push(17);
        myStack.push(3);
        myStack.push(39);
        myStack.push(43);
        System.out.println("Peeking: " + myStack.top());
        System.out.println("Popping 1 ele and peeking" + myStack.pop());
        System.out.println("Size: " + myStack.size());
        System.out.println("Top ele:" + myStack.top());
    }
}
