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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();  
            System.out.println(obj.countPairs(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {  
    static int countPairs(int arr[], int n) 
    {
         // Your code goes here
         for(int i=0;i<n;++i) {
             arr[i] = i * arr[i];
         }
         return quick(arr,0,arr.length-1);
    }
    static int quick(int arr[],int l,int r){
        if(l>=r)return 0;
        int mid=(l+(r-l)/2);
        
        int an=quick(arr,l,mid);
        an+=quick(arr,mid+1,r);
        an+=merge(arr,l,mid,r);
        return an;
    }
    static int merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r+1];
        for(int a=l;a<=r;a++){
            temp[a]=arr[a];
        }
        int i=l,j=mid+1,k=l;
        int count=0;
        while(i<=mid && j<=r){
            if(temp[i]<=temp[j]){
                arr[k++]=temp[i++];
            }else{
                arr[k++]=temp[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid){
            arr[k++]=temp[i++];
        }
        while(j<=r){
             arr[k++]=temp[j++];
        }
        return count;
    }
}
