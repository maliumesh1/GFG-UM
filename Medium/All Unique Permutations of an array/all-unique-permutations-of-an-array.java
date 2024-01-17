//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int[] vis = new int[n];
        ArrayList<Integer> ds = new ArrayList<>();
        
        Recursion(arr, ds, set, vis);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> ele : set)
            ans.add(ele);
            
        ans.sort((a, b) -> 
        {
            for(int i = 0; i < a.size(); i++)
            {
                int cmp = a.get(i).compareTo(b.get(i));
                if(cmp != 0)
                    return cmp;
            }
            
            return 0;
        });
        
        return ans;
    }
    
    private static void Recursion(ArrayList<Integer> arr, ArrayList<Integer> ds, HashSet<ArrayList<Integer>> set, int[] vis)
    {
        if(ds.size() == arr.size())
        {
            set.add(new ArrayList(ds));
            return;
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
            if(vis[i] == 0)
            {
                vis[i] = 1;
                ds.add(arr.get(i));
                Recursion(arr, ds, set, vis);
                vis[i] = 0;
                ds.remove(ds.size() - 1);
            }
        }
    }
};