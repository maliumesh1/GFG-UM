//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(a, n) ? 1:0);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        
        boolean ans=false;
        int i=0;
        int left=1;
        int right=2;
        while(left<n){
            if( right<n && arr[left]<=arr[i] && arr[right]<=arr[i]){
                ans=true;
            }else if(right>=n && arr[left]<=arr[i]){
                ans=true;
            }else{
                ans=false;
                break;
            }
            i++;
            left=2*i+1;
            right=2*i+2;
            
        }
        return ans;
    }
}