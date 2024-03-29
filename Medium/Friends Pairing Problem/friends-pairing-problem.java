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
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long countFriendsPairings(int n) 
    { 
         int mod=1000000007;
        long dp[]=new long [n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]%mod+(dp[i-2]*(i-1))%mod)%mod;
        }
        return dp[n];
        }
}    
 
 
 
 
 
 //NOT OPTIMIZE AT GFG 
//  class Solution
// {
//     public long countFriendsPairings(int n) 
//     { 
//       //code here
//         if(n==1 || n==2)
//         {
//             return n;
//         }
        
        
//          // countFriendsPairings = fri -> write
//         // //choices
//         // //single
//         // int f1 = fri(n-1);

//         // //pair
//         // int f2 = fri(n-2);
//         // int pair = (n-1) * f2;

//         // //TOTAL WAYS
//         // int tot = f1 + pair;
//         // return tot;


//         //  INSTEAD OF ABOVE CODE YOU WRITE FOLLOWING ONLY ONE LINE
//     return countFriendsPairings(n-1) + (n-1) *countFriendsPairings(n-2); //RUN
//     }
// } 