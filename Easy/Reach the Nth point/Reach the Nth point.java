//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int a = 1, b = 1, c;
        int mod = 1000000007;
        
        for(int i=1;i<n;i++) {
            c = (a+b) % mod;
            a = b;
            b = c;
        }
        return b;
    }
                                   
}
