class Node {
    int data;
    Node next;

    Node(int data) 
    //Constructor that accepts data parameter
    {
        this.data = data;
        this.next = null;
    }
}
//In linkedlist program Node class with data and next pointer along with constructor is must.

public class SinglyLL {

    Node head = null;
    //Why we are using head as null because when we create a linked list it is empty and head will point to null.

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }
    /*1.Create a new node with the given data.
      2.Connect pointer of the new node to point to the current head of the list.
      3.Update the head of the list as new node
     */

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    /*1.Create a new node with the given data.
      2.If the list is empty (head is null), set the head to point to the new node and return.
      3.Traverse the list starting from the head until you reach the last node (where next is null).
      4.Set the next pointer of the last node to point to the new node, effectively adding it to the end of the list.
     */

     
    // Add at specific position
    public void addAtPosition(int data, int pos) {

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        /* if (temp == null) {
            System.out.println("Position not valid");
            return;
        } */

        newNode.next = temp.next;
        temp.next = newNode;
    }
    /*1.Create a new node with the given data.
      2.If the position is 1, set the next pointer of the new node to point to the current head and update the head to point to the new node.
      3.Traverse the list to find the node currently at position pos - 1 (the node after which the new node will be inserted).
      4.If the position is valid (temp is not null), set the next pointer of the new node to point to temp's next node, and then set temp's next pointer to point to the new node, effectively inserting it at the specified position.
     */
// Function to reverse the singly linked list
public void reverse() {
//1.Parameters:prev(initially null), current(initially head), next(initially null)
    Node prev = null;      // This will become the new head
    Node current = head;   // Start from the current head
    Node next = null;      // Temporary node to store next node
//here current becomes null when we reach the end of the list, at that point prev will be pointing to the new head of the reversed list.
    while (current != null) {

        next = current.next;   // Step 1: store next node

        current.next = prev;   // Step 2: reverse the link

        prev = current;        // Step 3: move prev one step forward

        current = next;        // Step 4: move current one step forward
    }

    head = prev;   // Update head to the new first node
}


// Function to swap two nodes (by values x and y) in a singly linked list
public void swapNodes(int x, int y) {

    // Step 1: If both values are same, no swap needed
    if (x == y)
        return;

    // Step 2: Initialize previous and current pointers for x
    Node prevX = null;//why prevX is used because we need to keep track of the previous node of x to update its next pointer after the swap.
    Node currX = head;

    // Step 3: Search for node containing x until we reach EOL or find x
    while (currX != null && currX.data != x) {
        prevX = currX;        // move prevX
        currX = currX.next;   // move currX
    }
/* Result after loop:

currX → node containing x

prevX → node before x (needed later to reconnect links during swap). */
    // Step 4: Initialize previous and current pointers for y
    Node prevY = null;
    Node currY = head;

    // Step 5: Search for node containing y
    while (currY != null && currY.data != y) {
        prevY = currY;        // move prevY
        currY = currY.next;   // move currY
    }

    // Step 6: If either x or y is not present, stop
    if (currX == null || currY == null)
        return;

    // Step 7: If x is not head, link previous of x to currY
    if (prevX != null)
        prevX.next = currY;
    else
        head = currY; // x was head

    // Step 8: If y is not head, link previous of y to currX
    if (prevY != null)
        prevY.next = currX;
    else
        head = currX; // y was head

    // Step 9: Swap next pointers of currX and currY
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
}
    // Delete first node
    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Delete last node
    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }
    public boolean isCyclic(){
        //2 pointers why because we want to check if there is a cycle in the linked list. If there is a cycle, the fast pointer will eventually meet the slow pointer. If there is no cycle, the fast pointer will reach the end of the list (null) before the slow pointer.
        Node slow=head;
        Node fast=head;
        //here why in while loop we are checking for fast!=null and fast.next!=null because if fast becomes null or fast.next becomes null it means we have reached the end of the list and there is no cycle.
        while(fast!=null && fast.next!=null)
        //why we are not checking for slow!=null because slow will never become null if there is a cycle, it will keep moving and eventually meet the fast pointer. 
        {
            slow=slow.next;
            fast=fast.next.next;
            //why this movement because slow moves one step at a time and fast moves two steps at a time. If there is a cycle, fast will eventually catch up to slow.
            if(slow==fast){
                return true; // Cycle detected
            }

        }
        return false; // No cycle detected
    }
   // Function to find the middle node of a singly linked list
public void findMiddle() {

    // Step 1: If the list is empty, return
    if (head == null)
        return;

    // Step 2: Initialize two pointers
    Node slow = head;   // slow pointer moves one step
    Node fast = head;   // fast pointer moves two steps

    // Step 3: Traverse the list
    while (fast != null && fast.next != null) {

        slow = slow.next;        // move slow pointer by 1 node

        fast = fast.next.next;   // move fast pointer by 2 nodes
    }

    // Step 4: When fast reaches end, slow will be at middle
    System.out.println("Middle element is: " + slow.data);
}
// Function to split the linked list into two halves
// Function to split the linked list into two halves and print both parts
public void splitAndPrint() {

    // Step 1: If list is empty, return
    if (head == null)
        return;

    // Step 2: Initialize slow and fast pointers to find middle
    Node slow = head;   // moves one node at a time
    Node fast = head;   // moves two nodes at a time

    // Step 3: Traverse list to reach middle
    //Why these 
    while (fast != null && fast.next != null) {
        slow = slow.next;        // move slow pointer
        fast = fast.next.next;   // move fast pointer
    }

    // Step 4: Start of second half
    Node secondHead = slow.next;

    // Step 5: Break the list into two halves
    slow.next = null;
    //what 

    // Step 6: Print first half
    System.out.print("First half: ");
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    // Step 7: Print second half
    System.out.print("\nSecond half: ");
    temp = secondHead;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
    // Display linked list
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        SinglyLL list = new SinglyLL();

        list.addFirst(10);
        list.addFirst(5);

        list.addLast(20);
        list.addLast(30);

        list.addAtPosition(15, 3);

        list.display();

        list.deleteFirst();
        list.deleteLast();

        list.display();
        list.reverse();
        list.display();
        list.swapNodes(15, 20);
        list.display();
        list.findMiddle();
            list.splitAndPrint();
            

    }
}