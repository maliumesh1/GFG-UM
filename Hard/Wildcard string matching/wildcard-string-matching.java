//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern)
    {
        return solve(wild, pattern, 0, 0);
    }
    
    private static boolean solve(String wild, String pattern, int wInd, int pInd){
        // Reached end of both strings - pattern match
        if(wInd == wild.length() && pInd == pattern.length()){
            return true;
        }
        
        // Reached the end of the wild and last char is *, so it will match anything on pattern string
        if(wInd == wild.length() && wild.charAt(wInd-1) == '*')
            return true;
            
        // Reached End of the either string without satisfying above two cases, so it cannot match
        if(wInd == wild.length() || pInd == pattern.length())
            return false;
            
        // If current char is *, then try matching with 0 char or 1 char, it will solve recursively
        // for any number of chars
        if(wild.charAt(wInd) == '*'){
            return solve(wild, pattern, wInd, pInd+1) || solve(wild, pattern, wInd+1, pInd+1);
        // If current char is ? or both the strings have matching character, try matching next char
        }else if(wild.charAt(wInd) == '?' || wild.charAt(wInd) == pattern.charAt(pInd)){
            return solve(wild, pattern, wInd+1, pInd+1);
        }
        
        // all other cases must return false
        return false;
    }
}