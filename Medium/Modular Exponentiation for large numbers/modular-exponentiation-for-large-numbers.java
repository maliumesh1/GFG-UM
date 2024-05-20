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
            String s = br.readLine();
            String[] S = s.split(" ");
            long x = Long.parseLong(S[0]);
            long n = Long.parseLong(S[1]);
            long m = Long.parseLong(S[2]);
            Solution ob = new Solution();
            long ans = ob.PowMod(x, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        long rahee = 1;
        if(n == 0) return 1;
        if(n ==1) return x;
         rahee = PowMod(x,(n/2),m);
         rahee = (rahee  *rahee)%m;
         if(n%2 ==1)
         {
             return (rahee *x)%m;
         }
         return rahee ;
    }
}