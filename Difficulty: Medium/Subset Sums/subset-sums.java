//{ Driver Code Starts

// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends

class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        
        ArrayList<Integer> al = new ArrayList<>();
        
        find(0,0,arr,al);
        
        return al;
        
    }
    
    static void find(int i, int sum,ArrayList<Integer> al,ArrayList<Integer> op)
    {
        
        if(i==al.size())
        {
            op.add(sum);
            return;
        }
        
        //peak
        find(i+1, sum+al.get(i),al,op);
        
        
        //not peak
        find(i+1, sum,al,op);
    }
    
    
}