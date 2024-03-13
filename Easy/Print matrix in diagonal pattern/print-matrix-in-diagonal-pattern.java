//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
           int n = mat.length;
        int[] arr = new int[n*n];
        int idx = 0;
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 0, k = i; j <= i; j++, k--) {
                    arr[idx++] = mat[k][j];
                }
            } else {
                for(int j = 0, k = i; j <= i; j++, k--) {
                    arr[idx++] = mat[j][k];
                }
            }
        }
        
        for(int i = 1; i < n; i++) {
            if((n-i) % 2 == 1) {
                for(int r = n-1, c = i; c < n; c++, r--) {
                    arr[idx++] = mat[r][c]; 
                }
            } else {
                for(int r = n-1, c = i; c < n; c++, r--) {
                    arr[idx++] = mat[c][r];
                }
            }
        }
        return arr;
        
    }
}