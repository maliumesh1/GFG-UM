//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends

class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int i = 0;
        for(i = 0; i<s.length(); i++){
            if(s.charAt(i) == ch){
                count--;
            }
            if(count==0){
                break;
            }
        }
        if(i>=s.length()-1){
            return "";
        }
        s = s.substring(i+1);
        return s;
    }
}