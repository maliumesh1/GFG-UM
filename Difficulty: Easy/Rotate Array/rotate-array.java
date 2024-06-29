//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // taking testcases
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String[] starr = str.split(" ");

            // input n and d
            int n = Integer.parseInt(starr[0]);
            int d = Integer.parseInt(starr[1]);

            int[] arr = new int[n];
            String str1 = br.readLine();
            String[] starr1 = str1.split(" ");

            // inserting elements in the array
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(starr1[j]);
            }

            // calling rotateArr() function
            new Solution().rotateArr(arr, d, n);
            StringBuffer sb = new StringBuffer();

            // printing the elements of the array
            for (int t1 = 0; t1 < n; t1++) sb.append(arr[t1] + " ");
            System.out.println(sb);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
        static void rotateArr(int arr[], int d, int n) {
        int l=d%n;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)map.put(i,arr[i]);
        int a;
        for(int i:map.keySet())
        {
            a=i-l;
            if(a<0)
            {
                a=n+a;
            }
            arr[a]=map.get(i);
        }
    
    }
}

