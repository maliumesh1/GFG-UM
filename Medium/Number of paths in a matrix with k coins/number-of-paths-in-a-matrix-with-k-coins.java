//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    
    long solve(int i, int j, int val, int n, int k, int [][]arr, long [][][]dp) {
        if(i == n - 1 && j == n - 1 && val + arr[i][j] == k) 
            return 1;
        
        if(i >= n || j >= n || i < 0 || j < 0 || val > k)
            return 0;
            
        if(dp[i][j][val] != -1)
            return dp[i][j][val];
            
        long ans = 0;
        if(i + 1 < n)
            ans += solve(i + 1, j, val + arr[i][j], n, k, arr, dp);
        
        if(j + 1 < n)
            ans += solve(i, j + 1, val + arr[i][j], n, k, arr, dp);
            
        return dp[i][j][val] = ans;
    }
    
    long numberOfPath(int n, int k, int [][]arr) {
        long dp[][][] = new long[n][n][k + 1];
        for(int i = 0; i < n; i++)  
            for(int j = 0; j < n; j++)
                for(int m = 0; m <= k; m++)
                    dp[i][j][m] = -1;
                    
        return solve(0, 0, 0, n, k, arr, dp);
    }
}