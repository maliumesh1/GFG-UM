//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        StringBuilder ResStr = new StringBuilder(s);
        for(int i=0; i<r; i++){
            for(int j=0; j<ResStr.length(); j+=2){
                if(ResStr.charAt(j) == '0'){
                    ResStr.insert(j+1, '1');
                }
                else{
                    ResStr.insert(j+1, '0');
                }
                
                if(j>n){
                    break;
                }
            }
        }
        
        return ResStr.charAt(n);
    }
}