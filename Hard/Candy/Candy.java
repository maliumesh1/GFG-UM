//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        if(N == 0) return 0;
       
       int[] left = new int[N];
       int[] right = new int[N];
       
       left[0] = 1;
       right[N-1] = 1;
       for(int i=1; i<N; i++) 
           left[i] = ratings[i] > ratings[i-1] ? left[i-1]+1 : 1;
        
        for(int i=N-2; i>=0; i--) 
           right[i] = ratings[i] > ratings[i+1] ? right[i+1]+1 : 1;
        
        int ans = 0;
        for(int i=0; i<N; i++) ans += Math.max(left[i], right[i]);
        
        return ans;
    }
                  }
                        
