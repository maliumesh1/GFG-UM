//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int setBits(int N) {
        // code here
        int h=0;
        String a=Integer.toBinaryString(N);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                h++;
            }
        }return h;
    }
}