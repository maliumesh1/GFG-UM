//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.findMaxSum(N, M, Mat));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        // code here
          if(n<3||m<3){
            return -1;
        }
        // code here
        int res =Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int currentSum = (
                    mat[i][j]+mat[i][j+1]+mat[i][j+2]+ // Top row cell
                    mat[i+1][j+1]+                      // Middle cell
                    mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]  // Bottom row cell
                    );
                
                res = Math.max(res , currentSum );
                
            }
        }
        return res;
    }
};