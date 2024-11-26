//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int original = n; // Store the original number
        int count = 0;
        
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            
            // Check if the digit is not zero and divides the original number evenly
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10; // Remove the last digit
        }
        return count;
    }
}