class Node {
    int data;
    Node next;

    // Step 1: Constructor to create a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class JosephusLL {

    Node head = null;

    // Step 2: Function to insert nodes at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If list is empty make new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newNode;
    }

    // Step 3: Function to solve Josephus problem
    public void josephus(int k) {

        // If list is empty return
        if (head == null)
            return;

        // Convert list into circular linked list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            
        }
        temp.next = head;// Link last node to head to make it circular

        // Initialize pointers
        Node prev = temp;//Why prev = temp? Because temp is currently the last node which points to head, so it will be the previous node of head in the circular linked list. 
        Node curr = head;

        // Continue until only one node remains
        while (curr.next != curr)
        //while (curr.next != curr) means that the loop will continue until there is only one node left in the circular linked list. 
        //When there is only one node left, it will point to itself (curr.next == curr), indicating that it is the survivor of the Josephus problem.
        {

            // Move k-1 steps
            for (int i = 1; i < k; i++) {
                prev = curr;
                curr = curr.next;
                //we 
            }

            // Remove k-th node
            System.out.println("Eliminated: " + curr.data);
            prev.next = curr.next;// Link previous node to next node, effectively removing current node from the circle

            // Move to next node
            curr = prev.next;
        }

        // Last remaining node
        System.out.println("Survivor: " + curr.data);
    }

    // Step 4: Main method
    public static void main(String[] args) {

        JosephusLL list = new JosephusLL();

        // Create list 1 2 3 4 5
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        // Solve Josephus problem with k = 2
        list.josephus(2);
    }
}