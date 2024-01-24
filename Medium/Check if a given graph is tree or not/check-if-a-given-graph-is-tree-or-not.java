//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
    
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(u);
                edge.add(v);
                edges.add(edge);
            }
    
            Solution solution = new Solution();
            boolean result = solution.isTree(n, m, edges);
    
            if (result==true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
//User function Template for Java
class Solution {

    // Helper function to check for cycles using DFS
    private boolean isCycle(List<List<Integer>> adj, Set<Integer> vis, int n, int m, int node, int par){
        // Mark the current node as visited
        vis.add(node);

        // Traverse neighbors of the current node
        for (int newNode : adj.get(node)){
            // If the neighbor is not visited, continue DFS
            if (!vis.contains(newNode)){
                if (!isCycle(adj, vis, n, m, newNode, node)) return false;
            }
            // If the neighbor is already visited and not the parent of the current node, there is a cycle
            else if (newNode != par) return false;
        }
        return true;
    }

    // Main function to check if the given graph is a tree
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // Create an adjacency list to represent the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list based on the provided edges
        for (int idx = 0; idx < m; idx++){
            adj.get(edges.get(idx).get(0)).add(edges.get(idx).get(1));
            adj.get(edges.get(idx).get(1)).add(edges.get(idx).get(0));
        }

        // Set to keep track of visited nodes during DFS
        Set<Integer> vis = new HashSet<>();

        // Check for cycles using DFS starting from the first node (0 index) with no parent (-1)
        boolean res = isCycle(adj, vis, n, m, 0, -1);

        // If the number of visited nodes is not equal to the total number of nodes, the graph is not connected
        if (vis.size() != n) return false;

        // Return the result of the cycle check
        return res;
    }
}

