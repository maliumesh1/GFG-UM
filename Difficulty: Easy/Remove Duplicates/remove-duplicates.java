//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
     String removeDups(String S) 
    {
        // code here
        StringBuilder w = new StringBuilder();
        for (int x = 0; x < S.length(); x++) {
            char ch = S.charAt(x);
            if (w.indexOf(String.valueOf(ch)) == -1) {
                w.append(ch);
            }
        }
        return w.toString();
    }
} 