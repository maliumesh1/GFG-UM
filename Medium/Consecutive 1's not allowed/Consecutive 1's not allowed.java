//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    long countStrings(int n) 
    {
        // code here
        long mod = 1000000007;
        long lastNumwithZero = 1, lastNumwithOnes = 1, currentNumwithZero = 0;
        for (int i = 1; i <= n; i++) 
        {
            currentNumwithZero = (lastNumwithZero + lastNumwithOnes) % mod;
            lastNumwithOnes = lastNumwithZero;
            lastNumwithZero = currentNumwithZero;
        }
        return currentNumwithZero;
    }
                                 }
