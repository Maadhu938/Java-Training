class Node {
    int data;
    Node next;

    Node(int data) {
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
      2.Set the next pointer of the new node to point to the current head of the list.
      3.Update the head of the list to point to the new node
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
    }
}