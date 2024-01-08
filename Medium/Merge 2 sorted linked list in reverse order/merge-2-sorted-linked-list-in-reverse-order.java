//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here
	Node head = new Node(0);
        Node next = head.next;
        while (node1!=null && node2!=null) {
            if(node1.data<node2.data){
                Node newNode = new Node(node1.data);
                head.next = newNode;
                newNode.next = next;
                next = head.next;
                node1 = node1.next;
            }else{
                Node newNode = new Node(node2.data);
                head.next = newNode;
                newNode.next = next;
                next = head.next;
                node2 = node2.next;
            }
        }
        
        if(node1!= null){
            while(node1!=null){
                Node newNode = new Node(node1.data);
                head.next = newNode;
                newNode.next = next;
                next = head.next;
                node1 = node1.next;
            }
        }
        if(node2!=null){
            while(node2!=null){
                Node newNode = new Node(node2.data);
                head.next = newNode;
                newNode.next = next;
                next = head.next;
                node2 = node2.next;
            }
        }
        return head.next;
    }
}
