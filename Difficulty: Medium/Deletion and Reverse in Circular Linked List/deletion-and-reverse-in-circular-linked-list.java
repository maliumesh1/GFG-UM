//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    // Function to print nodes in a given circular linked list
    static void printList(Node head) {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int key = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            tail.next = head; // Make the list circular
            Solution ob = new Solution();
            Node current = ob.deleteNode(head, key);
            Node rev = ob.reverse(current);
            printList(rev);
        }
    }
}

// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // If the list is empty or contains only one node, return head as is
        if (head == null || head.next == head) return head;
        
        Node prev = null;       // Pointer to store the previous node during reversal
        Node curr = head;       // Pointer to traverse the list
        Node next = null;       // Pointer to store the next node temporarily
        Node tail = head;       // Store the head temporarily as the last node (tail) after reversal

        // Commented out the unnecessary tail finding loop as tail is initialized properly below

        // Loop through the list and reverse the links until we traverse back to the head
        do {
            next = curr.next;   // Store the next node
            curr.next = prev;   // Reverse the current node's next pointer
            prev = curr;        // Move the prev pointer to the current node
            curr = next;        // Move the curr pointer to the next node
        } while (curr != head); // Stop when we traverse back to the original head
        
        // After the loop, prev will be pointing to the new head (formerly the last node)
        tail.next = prev;       // Re-establish the circular link by pointing the old tail to the new head
        head = prev;            // Update head to point to the new head

        return head;            // Return the new head of the reversed list
    }

    // Function to delete a node with the specified key from a circular linked list
    Node deleteNode(Node head, int key) {
        // If the list is empty, return null
        if (head == null) return null;

        // Special case: If the head node contains the key
        if (head.data == key) {
            // If the list contains only one node, return null (list becomes empty)
            if (head.next == head) {
                return null;
            }

            // Find the last node (tail) to maintain the circular nature after deletion
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;  // Traverse until the last node (tail) is found
            }

            // Move head to the next node, as the current head is being deleted
            head = head.next;
            tail.next = head;      // Ensure the last node still points to the new head

            return head;           // Return the new head of the modified list
        }

        Node temp = head;  // Initialize a temporary pointer to traverse the list

        // Traverse the list to find the node with the key
        while (temp.next != head) { 
            if (temp.next.data == key) { // If the next node contains the key
                temp.next = temp.next.next; // Bypass the node to delete it
                break;  // Exit the loop after deleting the node
            }
            temp = temp.next; // Move to the next node
        }

        return head; // Return the head of the modified list
    }
}