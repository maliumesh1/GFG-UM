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
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int inversionCount(int arr[]) {
        int n=arr.length;
        return mergeSort(arr,0,n-1);
    }
    static int mergeSort(int a[],int l,int r){
        if(l>=r)    return 0;
        int mid = l+(r-l)/2, ans=0;
        ans += mergeSort(a,l,mid);
        ans += mergeSort(a,mid+1,r);
        ans += merge(a,l,mid,r);
        return ans;
    }
    static int merge(int a[],int l,int mid,int r){
        int n = mid-l+1, m = r-mid;
        int left[] = new int[n], right[] = new int[m];
        
        for(int i=0;i<n;i++){
            left[i]=a[i+l];
        }
        for(int i=0;i<m;i++){
            right[i]=a[mid+1+i];
        }
        
        int ans=0;
        for(int i=0, j=0;i<n;i++){
            while(j<m && left[i]>right[j]) j++;
            ans += (j);
        }
        
        int i=0, j=0, k=l;
        while(i<n && j<m){
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
            }else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        
        while(i<n){
            a[k]=left[i];
            i++;
            k++;
        }
        
        while(j<m){
            a[k]=right[j];
            j++;
            k++;
        }
        
        return ans;
    }
}
