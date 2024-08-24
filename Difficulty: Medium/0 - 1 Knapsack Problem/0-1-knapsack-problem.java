//{ Driver Code Starts
import java.io.*;
import java.util.*;

class gfg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int w = Integer.parseInt(br.readLine());

            String line = br.readLine();
            String[] tokens = line.split(" ");
            List<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] val = new int[array.size()];
            int idx = 0;
            for (int i : array) val[idx++] = i;

            String lin = br.readLine();
            String[] toke = lin.split(" ");
            List<Integer> array1 = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : toke) {
                array1.add(Integer.parseInt(token));
            }

            int[] wt = new int[array1.size()];
            idx = 0;
            for (int i : array1) wt[idx++] = i;

            // calling method knapSack() of class Solution
            System.out.println(new Solution().knapSack(w, wt, val));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return max value that can be put in knapsack of capacity
    static Integer[][]dp;
    public static int dfs(int w,int[]wt,int[]val,int index,int sum)
    {
        if(index>=val.length)
        return 0;
        int pick=0;
        if(dp[index][sum]!=null)return dp[index][sum];
        
        if(wt[index]+sum<=w)
        {
            pick=val[index]+dfs(w,wt,val,index+1,sum+wt[index]);
        }
        int notpick=dfs(w,wt,val,index+1,sum);
        return dp[index][sum]=Math.max(pick,notpick);
    }
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        dp=new Integer[val.length][W+1];
        return dfs(W,wt,val,0,0);
    }
}