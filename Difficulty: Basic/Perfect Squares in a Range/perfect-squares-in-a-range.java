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
            String S[] = read.readLine().split(" ");
            int a = Integer.parseInt(S[0]);
            int b = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.numOfPerfectSquares(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numOfPerfectSquares(int a, int b) {
        int sqrtA = (int)Math.ceil(Math.sqrt(a)); 
        int sqrtB = (int)Math.floor(Math.sqrt(b)); 
        return sqrtB - sqrtA + 1;
    }
};