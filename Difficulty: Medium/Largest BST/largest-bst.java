//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution {
    static int largestBst(Node root) {
        if (root == null) return 0;
        int[] maxsize = new int[1];
        maxsize[0] = 0;
        findLargest(root, maxsize);
        return maxsize[0];
    }

    static void findLargest(Node root, int[] maxsize) {
        if (root == null) return;
        
        // Check if the current subtree rooted at 'root' is a BST
        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            // Calculate the size of the subtree
            int size = getSize(root);
            // Update maxsize if this BST subtree is larger
            if (size > maxsize[0]) {
                maxsize[0] = size;
            }
        }
        
        // Recursively find largest BST in left and right subtrees
        findLargest(root.left, maxsize);
        findLargest(root.right, maxsize);
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    static int getSize(Node root) {
        if (root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
    }
}