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

public class LinkedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void makeLoop(Node head, Node tail, int x) {
        if (x == 0) return;

        Node curr = head;
        for (int i = 1; i < x; i++) curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            makeLoop(head, tail, k);

            Solution ob = new Solution();
            System.out.println(ob.countNodesinLoop(head));
        }
    }
}

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
         // Base case: If the list is empty or has only one node, there can't be a loop.
        if (head == null || head.next == null) {
            return 0;
        }
        
        Node fast = head; // Fast pointer moves 2 steps at a time.
        Node slow = head; // Slow pointer moves 1 step at a time.
        boolean loop = false; // Flag to track if a loop is detected.
        
        // Detect loop using Floyd's cycle detection algorithm.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loop = true;
                break;
            }
        }
        
        if (!loop) {
            return 0; // No loop found.
        }
        
        // Count the nodes in the loop.
        int count = 1;
        fast = fast.next; // Move fast pointer one step ahead.
        while (slow != fast) {
            count++;
            fast = fast.next;
        }
        
        return count;
    }
}