//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node reverse(Node head){
       if(head.next==null) return head;
       Node prev = head,cur = head.next; 
       prev.next = null;
       while(cur!=null){
           Node temp = cur.next;
           cur.next = prev;
           prev = cur;
           cur = temp;
       }
       return prev;
       
   }
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head.next==null) return head;
        Node temp1 = head,temp2  = head.next,t1 = temp1,t2 = temp2;
        // link the ascending sorted list with temp1 and descending with temp2 
        while(temp1.next!=null&&temp2.next!=null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            temp2.next = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
        // reverse the descending sorted list 
        t2 = reverse(t2);
        while(t1.next !=null){
            t1 = t1.next;
        }
        // link the two list
        t1.next = t2;
        return head;
   }

}