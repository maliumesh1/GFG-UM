//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class SortLL {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            addToTheLast(head);

            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(str[i]);
                addToTheLast(new Node(a));
            }

            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);

            printList(node);
            System.out.println();
        
System.out.println("~");
}
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }
}
// } Driver Code Ends


class GfG {
    public static Node quickSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node[] smaller = new Node[1];
        Node[] greater = new Node[1];

        partition(head, smaller, greater);

        smaller[0] = quickSort(smaller[0]);
        greater[0] = quickSort(greater[0]);

        head.next = greater[0];
        Node temp = smaller[0];
        while (temp != null && temp.next != null)
            temp = temp.next;

        if (temp != null)
            temp.next = head;
        else
            smaller[0] = head;

        return smaller[0];
    }

    private static void partition(Node pivot, Node[] smaller, Node[] greater) {
        Node temp = pivot.next;
        while (temp != null) {
            Node next = temp.next;
            if (temp.data <= pivot.data) {
                temp.next = smaller[0];
                smaller[0] = temp;
            } else {
                temp.next = greater[0];
                greater[0] = temp;
            }
            temp = next;
        }
    }
}