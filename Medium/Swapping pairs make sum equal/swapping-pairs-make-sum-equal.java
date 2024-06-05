//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    /**
     * This method checks if there exists a pair of values (one from each array)
     * such that swapping these values makes the sums of the two arrays equal.
     *
     * @param a The first array of long integers.
     * @param n The size of the first array.
     * @param b The second array of long integers.
     * @param m The size of the second array.
     * @return 1 if such a pair exists, otherwise -1.
     */
    long findSwapValues(long a[], int n, long b[], int m) {
        // Calculate the sum of elements in array a.
        long sumA = 0;
        for (long num : a) {
            sumA += num;
        }

        // Calculate the sum of elements in array b.
        long sumB = 0;
        for (long num : b) {
            sumB += num;
        }

        // The difference between sums of arrays a and b.
        long diff = sumA - sumB;

        // If the difference is odd, it's not possible to equalize the sums by swapping.
        if (diff % 2 != 0) {
            return -1;
        }

        // The target difference we need to achieve by swapping elements.
        diff /= 2;

        // Use a HashSet to store all elements from array a for quick lookup.
        HashSet<Long> setA = new HashSet<>();
        for (long num : a) {
            setA.add(num);
        }

        // Check for each element in array b if there's an element in array a
        // that can be swapped to balance the sums.
        for (long num : b) {
            // If setA contains (num + diff), swapping num from b with (num + diff) from a
            // will balance the sums of the two arrays.
            if (setA.contains(num + diff)) {
                return 1;
            }
        }

        // If no such pair is found, return -1.
        return -1;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int m = Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a, n, b, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends