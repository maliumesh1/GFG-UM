//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int radius) {
        int rectangleCount = 0;

        // Iterate through possible x-coordinates within the circle's diameter
        for (int x = 1; x < 2 * radius; x++) {
            int y = 1;
            // Increment y-coordinates while the point (x, y) is within or on the circle
            while (4 * radius * radius >= x * x + y * y) {
                rectangleCount++; // Count rectangles that can be formed with current (x, y)
                y++; // Increment y to check the next possible y-coordinate
            }
        }

        return rectangleCount; // Return the total count of rectangles inside the circle
    }
}

