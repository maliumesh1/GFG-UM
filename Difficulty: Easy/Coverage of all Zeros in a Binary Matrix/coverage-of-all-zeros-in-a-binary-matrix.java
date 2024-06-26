//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.findCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int m;
    static int n;
    private static boolean isvalid(int i,int j,int[][] matrix){
        if(i < m && i>=0 && j < n && j>=0 && matrix[i][j] == 1) return true;
        return false;
    } 
    public int findCoverage(int[][] matrix) {
        // code here
        m = matrix.length;
        n = matrix[0].length;
        int cnt = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    if(isvalid(i+1,j,matrix)) cnt++; //checking down position
                    if(isvalid(i,j+1,matrix)) cnt++; // checking left position
                    if(isvalid(i-1,j,matrix)) cnt++; // checking top position 
                    if(isvalid(i,j-1,matrix)) cnt++; // checking bottom position
                }
            }
        }
        return cnt;
    }
}