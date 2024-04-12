//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            long Arr[] = new long[N];
            String[] S = read.readLine().split(" ");
            for (int i = 0; i < N; i++) Arr[i] = Long.parseLong(S[i]);
            Solution ob = new Solution();
            System.out.println(ob.pairAndSum(N, Arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   static long pairAndSum(int n, long arr[]) {
        // As problem says, 1 <= arr[i] <= 10^8, so 32 bit width will be sufficient to 
        // represent any number
        
        // Also, 1 <= n <= 10^5, any bit count can go upto 10^5, hence integer data
        // type will be sufficient, no need to use long.
        int[] bitCounts = new int[32];
        
        // Variable to store required sum and pow for keeping track of power of 2
        long sum = 0;
        long pow = 1;
        
        // Find the sum of set bits at every place (0-31 position)
        for(int i=0; i<32; i++){
            for(long num:arr){
                bitCounts[i] += (num & 1<<i)>0? 1: 0;
            }
        }
        
        // If Any bit is set, then it must be in pair to contribute to a pair sum
        // E.g. bit sum at pos is 1, so it can't make any pair
        // and if bit sum at pos is 2, it can form only 1 pair
        // similar way, bit sum = 3, 3 pairs (1,2), (1,3), (2,3)
        // bit sum = 4, pairs = 6, formula = sum*(sum-1)/2;
        for(int i = 0; i<32; i++){
            sum += pow*((long)bitCounts[i]*(bitCounts[i]-1))/2;
            // Multiply by 2
            pow<<=1;
        }
        
        return sum;
    }
}