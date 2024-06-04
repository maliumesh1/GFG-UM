//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
       int carry = 1;
       StringBuilder sb = new StringBuilder();
       int i = s.length() - 1 ;
       while(i >= 0){
           int num = carry + s.charAt(i) - '0';
           
           if(num ==  1){
               sb.append("1");
               carry = 0;
           }
           else if(num == 0){
               sb.append("0"); 
               carry = 0;
           }
           else{
               sb.append("0"); 
               carry = 1;
           }
           i--;
       }
       if(carry == 1)
         sb.append("1");
         
        int j = 0;
        
        sb = sb.reverse();
        
        while(sb.charAt(j) != '1')
            j++;
         return sb.substring(j).toString();
    }
}