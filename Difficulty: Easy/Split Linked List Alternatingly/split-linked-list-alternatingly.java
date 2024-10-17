//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);

            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            Node head = new Node(arr.get(0));
            Node tail = head;

            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }

            Solution ob = new Solution();
            Node[] result = ob.alternatingSplitList(head);
            printList(result[0]);
            printList(result[1]);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/
class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
         if (head == null) {
            return new Node[]{null, null};
        }

        // Pointers for two new lists
        Node head1 = null, head2 = null;
        Node tail1 = null, tail2 = null;

        // Index to determine alternation
        int index = 0;

        // Traverse the original list
        Node current = head;
        while (current != null) {
            if (index % 2 == 0) {
                // Add to the first list
                if (head1 == null) {
                    head1 = tail1 = new Node(current.data);
                } else {
                    tail1.next = new Node(current.data);
                    tail1 = tail1.next;
                }
            } else {
                // Add to the second list
                if (head2 == null) {
                    head2 = tail2 = new Node(current.data);
                } else {
                    tail2.next = new Node(current.data);
                    tail2 = tail2.next;
                }
            }
            // Move to the next node
            current = current.next;
            index++;
        }

        // Return the heads of both lists
        return new Node[]{head1, head2};
    }
}