//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(in.readLine());

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(n);
            for (int i = 0; i < ans.size(); i++) out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   static List<Long> jugglerSequence(long n) 
    {
        List<Long> al = new ArrayList<Long>();
        al.add(n);
        helper(al);
        
        return al;
        
    }
    
    static void helper( List<Long> al)
    {
        long lastElement=(al.get(al.size()-1));
        if(lastElement==1)
            return;
            
        if(lastElement%2==0)
        {
            al.add((long) Math.floor(Math.sqrt(lastElement)));
            helper(al);
        }
        else
        {
            al.add((long) Math.floor(Math.pow(lastElement, 1.5)));
            helper(al);
        }
        
        return;       
    }
}