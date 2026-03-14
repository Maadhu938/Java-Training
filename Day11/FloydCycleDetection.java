// Floyd’s Cycle Detection Algorithm (Hare and Tortoise)
//
// Purpose:
// Detect whether a linked list contains a cycle (loop).
//
// Idea:
// Use two pointers that move at different speeds.
//
// slow pointer (tortoise) -> moves one step at a time
// fast pointer (hare) -> moves two steps at a time
//
// Algorithm:
//
// 1. Initialize two pointers at the head of the linked list.
//      slow = head
//      fast = head
//
// 2. Traverse the list while fast and fast.next are not null.
//
// 3. Move pointers at different speeds:
//      slow = slow.next        (moves 1 step)
//      fast = fast.next.next   (moves 2 steps)
//
// 4. If slow == fast at any point,
//      a cycle exists in the linked list.
//
// 5. If fast reaches null or fast.next becomes null,
//      the list has no cycle.
//
// Why it works:
// If a cycle exists, the fast pointer eventually laps the slow pointer
// inside the loop and both pointers meet at the same node.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (Only two pointers are used, no extra memory required)
// Floyd's Cycle Detection Algorithm (Hare and Tortoise)
// This program checks whether a linked list contains a cycle.

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FloydCycleDetection {

    // Function to detect cycle in linked list
    static boolean detectCycle(Node head) {

        // Initialize two pointers
        Node slow = head;  // moves one step
        Node fast = head;  // moves two steps

        // Traverse the linked list
        while (fast != null && fast.next != null) {

            slow = slow.next;         // move slow pointer by 1
            fast = fast.next.next;    // move fast pointer by 2

            // If both pointers meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If fast reaches NULL, no cycle exists
        return false;
    }

    public static void main(String[] args) {

        // Creating linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle for testing
        // Node 5 points back to Node 3
        head.next.next.next.next = head.next.next;

        // Check if cycle exists
        if (detectCycle(head))
            System.out.println("Cycle detected in linked list");
        else
            System.out.println("No cycle found");
    }
}