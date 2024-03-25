//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
      public void solve(String a, int i, int r, ArrayList<String>re){
        
        if(r==0){
            re.add(a);
            return;
        }
        solve(a+"1",i+1,r-1,re);
        if(i>0){
            solve(a+"0",i-1,r-1,re);
        }
        
    }
    ArrayList<String> NBitBinary(int n) {
        // code here
        ArrayList<String> ans= new ArrayList<>();
        String a="";
        solve(a,0,n,ans);
        return ans;
    }
}