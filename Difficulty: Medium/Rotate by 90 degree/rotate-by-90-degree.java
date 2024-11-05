//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();

            GFG g = new GFG();
            g.rotate(arr);
            printMatrix(arr);

            System.out.println("~");
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        transpose(mat);
        for (int i = 0; i < mat.length; i++){
            reverse(mat, i);
        }
    }
    
    private static void transpose(int[][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = i + 1; j < mat[0].length; j++){
                int val = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = val;
            }
        }
    }

    private static void reverse(int[][] mat, int row){
        int i = 0;
        int j = mat[0].length-1;

        while (i < j){
            int val = mat[row][i];
            mat[row][i] = mat[row][j];
            mat[row][j] = val;

            i++;
            j--;
        }
    }
}