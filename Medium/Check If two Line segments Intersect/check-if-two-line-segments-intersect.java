//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int p1[] = new int[2];
            int q1[] = new int[2];
            int p2[] = new int[2];
            int q2[] = new int[2];
            String S1[] = read.readLine().split(" ");
            p1[0] = Integer.parseInt(S1[0]);
            p1[1] = Integer.parseInt(S1[1]);
            q1[0] = Integer.parseInt(S1[2]);
            q1[1] = Integer.parseInt(S1[3]);
            String S2[] = read.readLine().split(" ");
            p2[0] = Integer.parseInt(S2[0]);
            p2[1] = Integer.parseInt(S2[1]);
            q2[0] = Integer.parseInt(S2[2]);
            q2[1] = Integer.parseInt(S2[3]);
            Solution ob = new Solution();
            String ans = ob.doIntersect(p1, q1, p2, q2);
            // if(ans)
            System.out.println(ans);
            // else
            // System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    // Custom class to represent a point in 2D space
    class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Computes the direction of the three given points
    // Returns 0 if collinear, 1 if clockwise, 2 if counterclockwise
    // Computes the direction of the three given points
// Returns 0 if collinear, 1 if clockwise, 2 if counterclockwise
private int direction(Point p, Point q, Point r) {
    long val = (long)(q.y - p.y) * (r.x - q.x) - (long)(q.x - p.x) * (r.y - q.y);
    if (val == 0) return 0; // collinear
    return (val > 0) ? 1 : 2; // clock or counterclockwise
}


    // Checks if point q lies on segment pr
    private boolean onSegment(Point p, Point q, Point r) {
        if (q.x <= Math.max(p.x, r.x) && q.x >= Math.min(p.x, r.x) &&
            q.y <= Math.max(p.y, r.y) && q.y >= Math.min(p.y, r.y)) {
            return true;
        }
        return false;
    }

    // Checks if two line segments intersect
    private boolean isIntersect(Point a1, Point b1, Point a2, Point b2) {
        // Find the four orientations needed for general and special cases
        int d1 = direction(a1, b1, a2);
        int d2 = direction(a1, b1, b2);
        int d3 = direction(a2, b2, a1);
        int d4 = direction(a2, b2, b1);

        // General case
        if (d1 != d2 && d3 != d4) return true;

        // Special cases
        // a1, b1, a2 are collinear and a2 lies on segment a1b1
        if (d1 == 0 && onSegment(a1, a2, b1)) return true;

        // a1, b1, b2 are collinear and b2 lies on segment a1b1
        if (d2 == 0 && onSegment(a1, b2, b1)) return true;

        // a2, b2, a1 are collinear and a1 lies on segment a2b2
        if (d3 == 0 && onSegment(a2, a1, b2)) return true;

        // a2, b2, b1 are collinear and b1 lies on segment a2b2
        if (d4 == 0 && onSegment(a2, b1, b2)) return true;

        // Doesn't fall in any of the above cases
        return false;
    }

    public String doIntersect(int p1[], int q1[], int p2[], int q2[]) {
        // Convert the integer arrays to Point objects
        Point a1 = new Point(p1[0], p1[1]);
        Point b1 = new Point(q1[0], q1[1]);
        Point a2 = new Point(p2[0], p2[1]);
        Point b2 = new Point(q2[0], q2[1]);

        // Check if the two line segments intersect or not
        return isIntersect(a1, b1, a2, b2) ? "true" : "false";
    }
}