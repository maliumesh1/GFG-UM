//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
         int n = A.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<B.size(); j++){
                String cur = B.get(j);
                
                if(i+cur.length() <= n && 
                    A.substring(i, i+cur.length()).equals(cur) &&
                    dp[i+cur.length()] == 1){
                        dp[i] = 1;
                }
                
            }
        }
        
        return dp[0];
    }
}