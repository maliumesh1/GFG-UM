//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
           if(head==null)  return head;
        //creating new result list
        Node result = new Node(-1);
        Node tmp = result;
        //using two pointer concept
        Node left=head, right=head.next;
        
        // 3->3->4->4->5
        
        //tc: o(n)
        while(right != null){
            /*if left data != right data, 
            we will link with our answer if it is not duplicate, 
            means right should just next to left*/
            if(left.data != right.data){
                if(left.next==right){
                    tmp.next = left;
                    tmp = tmp.next;
                }
                left = right;
            }
            right = right.next;
        }
        
        if(left.next==null) tmp.next = left;
        else    tmp.next = null;    //if it is not, than clean the end links
        
        return result.next;
    }
}