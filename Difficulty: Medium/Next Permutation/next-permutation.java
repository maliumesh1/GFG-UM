//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> res = new ArrayList<>();   
        
        int ind =-1;
        int n = arr.length;
        
        for( int i = n-2 ; i >= 0 ; i--){
            if( arr[i] < arr[i+1] ){
                ind = i;
                break;
            }
        }
        if( ind == -1 ) {
            reverse( arr , 0 , n-1);
        }else{
        
            for ( int i= n-1 ; i > ind ; i--){
                if( arr[i] > arr[ind]){
                    swap( arr, i , ind);
                    break;
                }
            }
            
            reverse( arr, ind+1 , n-1);
        }
        for( int i=0 ; i < n ; i++){
            res.add( arr[i]);
        }
        return res;
        
    }
    
    public static void swap( int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    public static void reverse( int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}