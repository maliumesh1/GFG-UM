//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            int h[] = new int[2];
            h[0] = sc.nextInt();
            h[1] = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<int[]> ans = obj.insertInterval(a, h);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print("[");
                System.out.print(ans.get(i)[0] + "," + ans.get(i)[1]);
                System.out.print("]");
                if (i != ans.size() - 1) System.out.print(",");
            }
            System.out.println("]");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res=new ArrayList<>();
        boolean merged=false;
        int start=newInterval[0],end=newInterval[1];
        for(int x[]:intervals){
            if(x[1]<newInterval[0]) res.add(x);
            else if(x[0]>newInterval[1]){
                if(!merged){
                    int temp[]=new int[2];
                    temp[0]=start;
                    temp[1]=end;
                    res.add(temp);
                    merged=true;
                }
                res.add(x);
            }
            else{
                start=Math.min(x[0],start);
                end=Math.max(x[1],end); 
            }
        }
        if(!merged){
            int temp[]=new int[2];
            temp[0]=start;
            temp[1]=end;
            res.add(temp);
        }
        return res;
    }
}

