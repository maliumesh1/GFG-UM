//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        // code here
         int dp[][] = new int[n][total+1];
        for(int i =0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(0,n,total, cost,dp);
    }
    public int helper(int i, int n, int total, int cost[], int dp[][]){
        if(i>=n){
            return 0;
        }
        if(dp[i][total] != -1){
            return dp[i][total];
        }
        int take = 0;
        int not = helper(i+1, n, total, cost, dp);
        if(total >= cost[i]){
            take = 1+helper(i+1, n, total-cost[i]+(int)(Math.floor(((double)cost[i]*0.9))), cost, dp);
        }
        return dp[i][total] = Math.max(take, not);
    }
}

