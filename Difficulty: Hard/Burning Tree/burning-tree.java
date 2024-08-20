//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
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
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

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
			if (i >= ip.length)
				break;

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

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int minTime(Node root, int target) {
        
        Map<Node,Node> map=new HashMap<>();
        preorder(root,null,map);
        
        Node tar = findTargetNode(root,target);
        
        Set<Node> vis=new HashSet<>();
        vis.add(tar);
        
        Queue<Node> q=new LinkedList<>();
        q.add(tar);
        
        int level=0;
        
        while(!q.isEmpty()){
            
            int size=q.size();
            for(int i=0;i<size;i++){
                
                Node pop = q.remove();
                Node par=map.get(pop), left=pop.left, right=pop.right;
                
                if(par!=null && !vis.contains(par)){
                    vis.add(par);
                    q.add(par);
                }
                if(left!=null && !vis.contains(left)){
                    vis.add(left);
                    q.add(left);
                }
                if(right!=null && !vis.contains(right)){
                    vis.add(right);
                    q.add(right);
                }
                
            }
            level++;
        }
        return level-1;
    }
    static Node findTargetNode(Node node,int x){
        if(node==null || node.data==x)  return node;
        
        Node left = findTargetNode(node.left,x);
        if(left!=null)  return left;
        
        return findTargetNode(node.right,x);
    }
    
    static void preorder(Node node,Node par,Map<Node,Node> map){
        if(node==null)  return;
        
        map.put(node,par);
        
        preorder(node.left,node,map);
        preorder(node.right,node,map);
    }
    
}