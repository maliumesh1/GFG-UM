//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            System.out.println(str);
            str = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends

class Solution {
    public void mergeArrays(int[] a, int[] b) {
        int m = a.length, n = b.length;

        // Traverse both arrays and make sure 'a' always has the smallest elements in sorted order.
        for (int i = 0; i < m; i++) {
            if (a[i] > b[0]) {
                // Swap the larger element from 'a' with the smallest element in 'b'.
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Maintain 'b' as sorted.
                int first = b[0];
                int k;
                for (k = 1; k < n && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                b[k - 1] = first;
            }
        }
    }
}