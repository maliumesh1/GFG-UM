//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            // Ensure input is read correctly
            inputLine = br.readLine().trim().split(" ");
            if (inputLine == null || inputLine.length == 0) {
                System.out.println("Invalid input");
                continue;
            }

            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        
        // Base case: if only one element, no difference
        if (n == 1) return 0;
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initial difference between max and min heights
        int diff = arr[n - 1] - arr[0];
        
        // Smallest and largest values after adjustments
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        // Iterate through the array to find the minimum possible difference
        for (int i = 0; i < n - 1; i++) {
            int mini = Math.min(smallest, arr[i + 1] - k);
            int maxi = Math.max(largest, arr[i] + k);
            
            // Skip if mini is negative
            if (mini < 0) continue;
            
            // Update the difference
            diff = Math.min(diff, maxi - mini);
        }
        
        return diff;
    }
}

