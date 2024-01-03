//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        int[] count = new int[3]; // Count array to store the occurrences of characters 0, 1, and 2
        int a = 0, b = 0, c = Integer.MAX_VALUE;

        while (a < S.length()) {
            count[S.charAt(a) - '0']++; // Increment the count for the current character
            a++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                c = Math.min(c, a - b); // Update the minimum length
                count[S.charAt(b) - '0']--; // Decrement the count for the character at index b
                b++;
            }
        }

        return (c == Integer.MAX_VALUE) ? -1 : c;
    }
}