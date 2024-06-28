//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input_line[] = read.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            String input_line1[] = read.readLine().trim().split("\\s+");
            int[][] a = new int[n][n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            String ans = ob.pattern(a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
      public static boolean isPalindrome(int[][] arr, int index, boolean isRow) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (isRow) {// if true then check rows
                if (arr[index][left] != arr[index][right]) {
                    return false;
                }
            } else { // else check column
                if (arr[left][index] != arr[right][index]) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
    public String pattern(int[][] arr) {
        // Code here
        int n = arr.length;
        // for row check
        for(int i =0; i < n; i++){
            
            if(isPalindrome(arr , i ,true)){
                
                return i + " R";
            }
        }
        //for col check
        // Check columns
        for (int j = 0; j < n; j++) {
            
            if (isPalindrome(arr , j ,false)) {
                return j + " C";
            }
        }

        // If no palindromes are found
        return "-1";
    }
}