//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
 boolean[] temp = new boolean[n + 1];

    // Mark numbers present in arr as true
    for (int num : arr) {
        temp[num] = true;
    }

    // Find the missing number
    for (int i = 1; i <= n; i++) {
        if (!temp[i]) {
            return i; // Return the missing number
        }
    }

    return -1; // Default return if no number is missing (though based on problem, there should be one missing)
}


}