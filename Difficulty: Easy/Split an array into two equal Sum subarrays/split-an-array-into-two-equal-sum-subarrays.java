//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends

class Solution {
    int count=0;
    int sum1=0;
    public boolean canSplit(int arr[]) {
        // code here
        int j=arr.length-1;
        int sum2=arr[j];
        while(j>0){
            if(count==0){
            calc(arr,0,j);
            }
            count++;
            if(sum1==sum2){
                return true;
            }
            j=j-1;
            sum1=sum1-arr[j];
            sum2=sum2+arr[j];
            
        }
        return false;
    }
    
    public void calc(int[]array,int i,int j){
        if(i==j) return;
        sum1=sum1+array[i];
        calc(array,i+1,j);
    }
}