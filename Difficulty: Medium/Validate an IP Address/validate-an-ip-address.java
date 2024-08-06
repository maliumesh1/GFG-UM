//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        
       String []s=str.split("\\.");
       
       if(s.length!=4)return false;
       int []arr=new int[s.length];
       
       for(int i=0;i<s.length;i++){
           if(s[i].length()==0)return false;
           arr[i]=Integer.valueOf(s[i]);
           String p=""+arr[i];
           if(p.length()!=s[i].length())return false;
       }
       
       for(int i=0;i<s.length;i++){
           if(arr[i]>=0 && arr[i]<=255)continue;
           else return false;
       }
       
       return true;
    }
}