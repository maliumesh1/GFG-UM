//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends

 
// User function Template for Java

class Solution {
    int lps(String str) {
        // code here
        int i=0, count =0, k=1, j=1;
        while( i<str.length() && j < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j++;
                count ++;
            }else{
                i=0;
                j=k;
                k++;
                count =0;
            }
        }
        return count;
    }
}