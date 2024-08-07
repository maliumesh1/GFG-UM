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


// User function Template for Java

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
       int l = 0;
       int r = 0;

    while (l < arr1.length && r < arr2.length) {
    if (k == 1) {
        return (long)(Math.min(arr1[l], arr2[r]));
    }
    if (arr1[l] < arr2[r]) {
        l++;
    } else {
        r++;
    }
    k--;
    }

// If one of the arrays is exhausted
while (l < arr1.length) {
    if (k == 1) {
        return (long)(arr1[l]);
    }
    l++;
    k--;
}

while (r < arr2.length) {
    if (k == 1) {
        return (long)(arr2[r]);
    }
    r++;
    k--;
}

// If k is still greater than 1 after the arrays are exhausted
return 0;
    }
}