//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
        // code here
        Stack<Character> stack = new Stack<>();
        int[] dp = new int[s.length()];
        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(')
                stack.push('(');
            else{
                if(stack.isEmpty())continue;
                int len = 2;
                if(i>=2)
                    len += dp[i-1];
                if(i-len>=0)
                    len += dp[i-len];
                dp[i] = len;
                max = Math.max(max,dp[i]);
                stack.pop();
            }
        }
        return max;
    }
}