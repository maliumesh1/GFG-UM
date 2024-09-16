//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{

    static Boolean isSubsetSum(int N, int arr[], int sum) {
        boolean dp[][] = new boolean[N + 1][sum + 1]; // DP matrix

        // Initialization of the first row and column
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                    // No items, so no subset can make a non-zero sum
                    dp[i][j] = false;
                }
                if (j == 0) {
                    // Sum is 0, so the empty subset always satisfies this
                    dp[i][j] = true;
                }
            }
        }

        // DP logic: filling the table
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    // Either include the current element or exclude it
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    // Exclude the current element
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[N][sum]; // Return true or false based on subset sum existence
    }
}