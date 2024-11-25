//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends

class Solution {
    int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int pStart=1;
        int pEnd=1;
        for(int i=0; i<arr.length; i++){
            pStart*=arr[i];
            pEnd*=arr[arr.length-1-i];
            max=Math.max(max,Math.max(pStart,pEnd));
            if(pEnd==0) pEnd=1;
            if(pStart==0) pStart=1;
        }
        
        return max;
    }
}

