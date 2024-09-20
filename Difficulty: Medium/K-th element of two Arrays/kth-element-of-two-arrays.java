//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends


class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
       int[] ans = new int[arr1.length + arr2.length];
        int start = 0;
        int start2 = 0;
        int i = 0;
        while (start < arr1.length && start2 < arr2.length) {
            if (arr1[start] < arr2[start2]) {
                ans[i++] = arr1[start++];
            } else {
                ans[i++] = arr2[start2++];
            }
        }
        while (start < arr1.length) {
            ans[i++] = arr1[start++];
        }
        while (start2 < arr2.length) {
            ans[i++] = arr2[start2++];
        }
        
        return ans[k-1];
    }
}