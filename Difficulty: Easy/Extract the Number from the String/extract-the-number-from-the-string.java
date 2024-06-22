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
        long max = Integer.MIN_VALUE;
        int n = sentence.length();
        
        for(int i = 0; i < n; i++)
        {
            long sum = 0;
            boolean isEnter = false;
            
            while(i < n && Character.isDigit(sentence.charAt(i)))
            {
                sum = sum*10 + (sentence.charAt(i) - '0');
                isEnter = true;
                if(sentence.charAt(i) - '0' == 9)
                {
                    while(i < n && Character.isDigit(sentence.charAt(i)))
                    {
                        i++;
                    }
                    sum = 0;
                    isEnter = false;
                    break;
                }
                i++;
            }
            
            if(isEnter)
            {
                max = Math.max(max,sum);
            }
        }
        
        if(max == Integer.MIN_VALUE)
        {
            return -1;
        }
        
        return max;
    }
}