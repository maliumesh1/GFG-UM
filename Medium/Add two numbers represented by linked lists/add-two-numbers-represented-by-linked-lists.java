//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node num1 = new Node(val);
            Node tail = num1;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node num2 = new Node(val);
            tail = num2;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
         // return head of sum list
        num1 = reverse(num1);
        num2 = reverse(num2);
        Node h = reverse(add(num1,num2));
        while(h!=null && h.data == 0) h = h.next;
        if(num1 != null && num2 != null && h==null) return new Node(0); 
        return h;
    }
    
    static Node add(Node head1, Node head2){
        Node newNode = new Node(-1);
        Node tail = newNode;
        boolean carry = false;
        while(head1 != null && head2 != null){
            int n1 = head1.data;
            int n2 = head2.data;
            int sum = n1 + n2;
            if(carry){
                sum++;
                carry = false;
            }
            if(sum > 9) carry = true;
            int digit = sum%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1 != null){
            int n = head1.data;
            if(carry){
                n++;
                carry = false;
            }
            if(n > 9) carry = true;
            int digit = n%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head1 = head1.next;
        }
        while(head2 != null){
            int n = head2.data;
            if(carry){
                n++;
                carry = false;
            }
            if(n > 9) carry = true;
            int digit = n%10;
            Node node = new Node(digit);
            tail.next =node;
            tail = node;
            head2 = head2.next;
        }
        if(carry){
            Node node = new Node(1);
            tail.next = node;
            tail = node;
        }
        return newNode.next;
        
    }
    
    static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}