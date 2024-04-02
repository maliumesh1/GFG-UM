//{ Driver Code Starts
//Initial Template for Java

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
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
    //     // Code here
    //     class Solution {
    // public boolean isPalindrome(int x) {
        int k=0;
        int d=n;
        while(n>0)
        {
            int r = n%10;
            k = k*10 + r;
            n=n/10;
        }
        if(k == d){     
            return "Yes";       
            } 
        else{
            return "No";
        }
    } 
}
