//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.pairsViolatingBST(n, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private static void inorder(Node root, List<Integer> ls){
        if (root == null) return;
        inorder(root.left, ls);
        ls.add(root.data);
        inorder(root.right, ls);
    }
    
    private static void mergeSort(int[] arr, int low, int high, int[] ans){
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid, ans);
        mergeSort(arr, mid + 1, high, ans);
        merge(arr, low, mid, high, ans);
    }
    
    private static void merge(int[] arr, int low, int mid, int high, int[] ans){
        int[] temp = new int[high - low + 1];
        int ptr1 = low, ptr2 = mid + 1, ptr3 = 0;
        while(ptr1 <= mid || ptr2 <= high){
            if(ptr1 == mid + 1){
                temp[ptr3++] = arr[ptr2++];
            }else if(ptr2 == high + 1){
                temp[ptr3++] = arr[ptr1++];
            }else if(arr[ptr1] <= arr[ptr2]){
                temp[ptr3++] = arr[ptr1++];
            }else{
                ans[0] += mid - ptr1 + 1;
                temp[ptr3++] = arr[ptr2++];
            }
        }
        
        
        for(int i = 0; i < temp.length; ++i){
            arr[low + i] = temp[i]; 
        }
    }
    
    public static int pairsViolatingBST(int n, Node root) {
        List<Integer> ls = new ArrayList<>();
        inorder(root, ls);
        int[] ans = new int[1];
        int[] temp = new int[ls.size()];
        for(int i = 0; i < temp.length; ++i) {
            temp[i] = ls.get(i);
        }
        mergeSort(temp, 0, temp.length - 1, ans);
        return ans[0];
    }
}