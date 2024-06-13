//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
         final int MOD = 1000000007;
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        int P0 = 1, P1 = 1, P2 = 1;
        for (int i = 3; i <= n; i++) {
            int Pn = (P0 + P1) % MOD;
            P0 = P1;
            P1 = P2;
            P2 = Pn;
        }
        
        return P2;
    }
    
}
