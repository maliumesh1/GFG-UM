//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);

        if (n == 1) {
            return list;
        }

        ArrayList<Long> prev = nthRowOfPascalTriangle(n - 1);

        for (int i = 1; i < (n + 1) / 2; i++) {
            long val = (prev.get(i - 1) + prev.get(i)) % 1_000_000_007L;
            list.add(val);
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            list.add(list.get(i));
        }
        return list;
    }
}