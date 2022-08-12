#                                           **Data Structure Using Java**☕

### Welcome to my data structures repo!🌠
*This repo contains the implementations in **Java** for basic data structures.*
Feel free to fork this repo or use it for your projects or for studies! :)
If there are any issues, raise an issue and I'll look into it as soo as I can.




## Contents
### Data Structures implemented:
1. Singly Linked List 
2. Circularly Singly Linked List


### Packages and classes:
  

| Packages   | Classes          |
| -------- | -------------- |
| SinglyLinkedList | main(), LinkedList1(), Node()|
| CircularlySinglyLinkedList |  main(), CircularLinkedList(), Node() |

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

## -- Please note  -- 
The repo may keep changing and updating based on the requirements. I will be adding new implementations.

