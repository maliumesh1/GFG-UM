//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int maxWater(int arr[]) { 
        // Your code here
         // time complexity O(n) : n=height.length;
        // public static int trappedRainWater(int height[]) {
        // int n = height.length;
        // calculate the left max boundary
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        // calculate the right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);

        }

        int  trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {

            // waterLevel =min(leftMaxBoundary ,rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel - arr[i];

        }

        return trappedWater;
    }
}
