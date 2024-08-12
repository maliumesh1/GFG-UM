//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int m = arr1.length - 1;
        int n = arr2.length - 1;
        int sum = m + n + 2;
        int[] arr = new int[m + n + 2];
        int k = m + n + 1;
        while (k >= 0) {
            if (m >= 0 && (n < 0 || arr1[m] > arr2[n])) arr[k--] = arr1[m--];
            else if (n >= 0) arr[k--] = arr2[n--];
        }
        return (arr[sum / 2] + arr[sum / 2 - 1]);
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends