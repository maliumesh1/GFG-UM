//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i=0;i<N;i++){
            sum = sum + arr[i];
        }
        if(sum % 2 != 0){
            return 0;
        }
        sum = sum /2;
        boolean ans = subset(arr, sum, N);
        if(ans != true){
            return 0; 
        }
        return 1;
    }
    static boolean subset(int arr[], int sum, int n){
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v = arr[i-1];
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
}