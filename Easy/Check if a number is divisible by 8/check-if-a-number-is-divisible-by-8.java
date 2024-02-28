//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to check whether the given number is divisible by 8.
    public static int DivisibleByEight(String s) {
        // Extract the last three digits of the string.
        String lastThreeDigits = s.substring(Math.max(s.length() - 3, 0));

        // Convert the last three digits to an integer.
        int lastThreeDigitsInt = Integer.parseInt(lastThreeDigits);

        // Check if the last three digits are divisible by 8.
        if (lastThreeDigitsInt % 8 == 0) {
            return 1; // Return 1 if divisible by 8.
        } else {
            return -1; // Return -1 otherwise.
        }
    }

}