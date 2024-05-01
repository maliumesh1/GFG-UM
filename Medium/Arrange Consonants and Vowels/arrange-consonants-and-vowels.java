//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
  StringBuilder vow = new StringBuilder();
        StringBuilder con = new StringBuilder();
        Node tmp = head;
        while(tmp != null){
            char c = tmp.data;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                vow.append(c);
            else 
                con.append(c);
            tmp = tmp.next;
        }
        tmp = head;
        for(int i = 0; i < vow.length(); i++){ 
            tmp.data = vow.charAt(i);
            tmp = tmp.next;
        }
        for(int i = 0; i < con.length(); i++) {
            tmp.data = con.charAt(i);
            tmp = tmp.next;
        }
        return head;  }
}