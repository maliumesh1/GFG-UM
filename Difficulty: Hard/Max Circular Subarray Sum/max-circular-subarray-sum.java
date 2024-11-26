//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {

    public int circularSubarraySum(int arr[]) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int currMin=0;
        int currMax=0;
        int sum=0;
        
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        
        
        
        for(int i=0;i<arr.length;i++){
            currMin=currMin+arr[i];
            
            min=Math.min(currMin,min);
          
            
            if(currMin>0){
                currMin=0;
            }
            
        }
        
        
        for(int i=0;i<arr.length;i++){
            
            currMax=currMax+arr[i];
            max=Math.max(max,currMax);
            
            if(currMax<0){
                currMax=0;
            }
            
        }
        return Math.max(max,sum-min);

       
    }
}