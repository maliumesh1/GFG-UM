//{ Driver Code Starts
import java.util.Scanner;

// Node Class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Linked List Class
class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    // creates a new node with given value and appends it at the end of the linked list
    void insert(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }
}


public class Main {
    static void printList(Node n) 
    {
        while (n != null) {
            System.out.print(n.data);
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            LinkedList LL1 = new LinkedList();
            String l1 = sc.next();
            for (int j = 0; j < n; ++j) {
                int x = Character.getNumericValue(l1.charAt(j));
                LL1.insert(x);
            }

            int m = sc.nextInt();
            LinkedList LL2 = new LinkedList();
            String l2 = sc.next();
            for (int j = 0; j < m; ++j) {
                int x = Character.getNumericValue(l2.charAt(j));
                LL2.insert(x);
            }

            Solution ob = new Solution();
            Node res = ob.subLinkedList(LL1.head, LL2.head);
            printList(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/
class Solution {
    
    Node removeZero(Node head){
        
        if(head == null)
            return null;
            
        while(head != null && head.data == 0){
            head = head.next;
        }
        
        return head;
    }
    
    int length(Node head){
        int n = 0;
        
        Node curr = head;
        
        while(curr != null){
            n++;
            curr = curr.next;
        }
        
        return n;
    }
    
    Node reverse(Node head) {

        Node p = null;
        Node q = head, n = head;
    
        while (q != null) {
          n = n.next;
    
          q.next = p;
          p = q;
          q = n;
    
        }
    
        return p;
    }
    
    Node subtract(Node head1, Node head2, int n1, int n2){
        
        Node res = new Node(0);
        
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node curr1 = head1, curr2 = head2, curr3 = res;
        
        while(curr1 != null || curr2 != null){
            
            Node next = curr1.next;
            
            int a = curr1 != null ? curr1.data : 0;
            int b = curr2 != null ? curr2.data : 0;
            
            if(a < b){
                a += 10;
                next.data = next.data - 1;
            }
            
            curr3.next = new Node(a - b);
            curr1 = curr1.next;
            if(curr2 != null ) curr2 = curr2.next;
            curr3 = curr3.next;
        }
        
        res = res.next;
        res = reverse(res);
        res = removeZero(res);
        
        return res;
    }
    
    public Node subLinkedList(Node head1, Node head2) {
        
        if(head1 == null){
            return head2;
        }
        
        if(head2 == null){
            return head1;
        }
        
        if(head1 == null && head2 == null){
            return null;
        }
        
        head1 = removeZero(head1);
        head2 = removeZero(head2);
        
        if(head1 == null && head2 == null){
            return new Node(0);
        }
        
        int n1 = length(head1);
        int n2 = length(head2);
        
        Node ans = null;
        
        if(n1 < n2){
            ans = subtract(head2, head1, n2, n1);
        }else if(n1 == n2){
            
            Node curr1 = head1;
            Node curr2 = head2;
            boolean flag = false;
            
            while(curr1 != null){
                if(curr1.data < curr2.data){
                    ans = subtract(head2, head1, n2, n1);
                    flag = true;
                    break;
                }else if(curr1.data > curr2.data){
                    ans = subtract(head1, head2, n1, n2);
                    flag = true;
                    break;
                }   
                
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            
            if(flag == false){
                ans = new Node(0);
            }
            
        }else{
            ans = subtract(head1, head2, n1, n2);
        }
        
        return ans;
    }
}
        
