//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
         long left = Arrays.stream(arr).max().getAsInt(); 
        long right = Arrays.stream(arr).sum(); 

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (isPossible(arr, N, K, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }
    
    static boolean isPossible(int[] arr, int N, int K, long maxSum) {
        int count = 0;
        int currentSum = 0;
        
        for(int i = 0; i<N; i++) {
            currentSum += arr[i];
            
            if(currentSum > maxSum) {
                count++;
                currentSum = arr[i];
                
            }
        }
        
        count++;
        return count <= K;
    }
};