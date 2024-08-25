//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
     long ExtractNumber(String sentence) {
        // code here
        String[] str=sentence.split(" ");
        long temp=-1;
        long max=-1;
        for(int i=0;i<str.length;i++){
            String t=str[i];
            char ch=t.charAt(0);
            if((int)ch>=48 && (int)ch<57 && t.contains("9")==false){
                temp=Long.parseLong(str[i]);
                if(max<temp){
                    max=temp;
                }
            }
        }  
        return max;
     }
}