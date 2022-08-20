#                                           **Data Structure Using Java**☕

### Welcome to my data structures repo!🌠
*This repo contains the implementations in **Java** for basic data structures.*
Feel free to fork this repo or use it for your projects or for studies! :)
If there are any issues, raise an issue and I'll look into it as soo as I can.




## Contents
### Data Structures implemented:
1. Singly Linked List 
2. Circularly Singly Linked List
3. Doubly Linked List
4. Stacks 
    * Using arrays,
    * Using Linked List.


### Packages and classes:
  

| Packages   | Classes          |
| -------- | -------------- |
| SinglyLinkedList | main(), LinkedList1(), Node()|
| CircularlySinglyLinkedList |  main(), CircularLinkedList(), Node() |
| DoublyLinkedList | main(), DoublyLinkedList(), Node() |
| StackUsingArray | main(), Stack() |
| StackUsingLinkedList | main(), LinkedList(), Java() |

---

### 1. Singly Linked list:
Singly Linked list is a data structure that is used to store data of anytype in special **_nodes_**. These nodes contain 2 attributes/feilds:
1. Data (The value we want to store)
2. Next (the address of the next node)

(note- You can use any name for the attributes while implimenting this data structure.)

Here is a pictorial representaion for Singly linked list:

<img src= "https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200922124319/Singly-Linked-List1.png" width="500" height="200" />


##### Simple Analogy:
You can imagine a collection of boxes tied one by one with a rope.
The *boxes* are the nodes and the *ropes* connecting the boxes are the links.

##### Implementation:
* We need a **head** pointer to point to the first node.
* We use the head for traversing the nodes.
* Note that the last node will have its next field value as null.
* We also use a **tail** pointer that points to the last node to get the last value.

##### Check the code files to understand the working

---

### 2. Circularly Singly Linked List:
Circular Singly Linked List is a variation of Linked list in which the first element points to the last element and the last element points to the first element.
Its the same as Singly Linked List with the only difference being the last node points back to the first node.
My version of the code doesn't require a **head** node. However, I've used the **tail** node that helps me get the last as well as the first nodes value.

Here's a pictorial represantation for Circular Singly Linked List:

<img src="https://iq.opengenus.org/content/images/2020/05/trial_image.png" width="500" height="200"/>

##### Check the code files to understand the working
---

### 3. Doubly Linked List:
Java Doubly Linked List is a type of Linked List where each node apart from storing data has two links. The first link points to the previous node and the other link points to the next node of the list. Doubly Linked List, also abbreviated as DLL is much like a Single Linked List.
In this data structure, we make use of 2 empty nodes:
* Header
* Trailer

The use of these two empty nodes makes our implementation easier as we don't need to worry if the list is empty or not.

Here is a pictorial representation of DLL:

<img src = "https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL_add_end1.png" width = "500" height = "200" />

##### Please check code to understand the working.
---

### 4. Stacks:
Stacks are data structures that works on the First-In Last-Out principle (FILO). This means that anything that goes in first will come out last. You can take a bucket as an example analogy. Assume you put in items one by one till the bucket is filled. Now when you want to remove the items, you start by removing the top most item in the bucket. The bucket is a stack and the items are the values that you want to store. This data structure can be implemented in two ways.
* Using Arrays,
* Using Linked List.

Both of them have their own pros and cons. Arrays have a faster time complexity but have a fixed size. Meanwhile, linked list has the freedom of increasing its size as its not statically allocated.

Stacks have the a few basic functionalities. Few of the stack ADT that have been implimented are as follows:
* getSize()
* isEmpty()
* push()
* pop()
* peek()

Note that only one element can be pushed or popped at a given time. You cannot pop more than one element within a single time frame.

Here is a pictorial representation of stacks:

<img src = "https://www.callicoder.com/static/b55c9fdd2a75568271a20da5f0ec675f/d22c2/java-stack-data-structure.jpg" width = "500" height="200" />

##### Please check the code for understanding the working of the implementation.


---
## -- Please note  -- 
The repo may keep changing and updating based on the requirements. I will be adding new implementations.

