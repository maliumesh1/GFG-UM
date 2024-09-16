//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int d;
            d = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countPartitions(n, d, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
   static int mod=(int)Math.pow(10,9)+7;
    public static int countSubsetWithTarget(int n, int arr[], int target, int dp[][]){
        if(n == 0) {
            if(target == 0)
                return 1;
            return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        else if(arr[n-1]>target){
            return dp[n][target]=countSubsetWithTarget(n-1,arr,target,dp)%mod;
        }
        else{
            return dp[n][target]=(countSubsetWithTarget(n-1,arr,target,dp)+countSubsetWithTarget(n-1,arr,target-arr[n-1],dp))%mod;
        }
    }
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if((d+sum)%2!=0||sum<d||n==1)return 0;
        int target=(sum+d)/2;
        int dp[][]=new int[n+1][target+1];
        
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        countSubsetWithTarget(n,arr,target,dp);
        return dp[n][target];
    }
}
        
