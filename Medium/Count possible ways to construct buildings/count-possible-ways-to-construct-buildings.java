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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        // Code here
         long mod =1000000007;
        if(N==1)    return 4;
        if(N==2)    return 9;
        
        long prev = 2, curr =3, ans =0;
        for(int i=3; i<=N; i++) {
            ans = (prev + curr)%mod;
            prev = curr;
            curr = ans;
        }
        return (int)(ans*ans % mod);
    }
}