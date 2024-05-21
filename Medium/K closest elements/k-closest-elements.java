//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
           int ans[] = new int[k];
        int ind = findInd(arr, n, x);
        int i=ind, j=ind;
        while(i>=0 && arr[i]==x) i--;
        while(j<n && arr[j]==x) j++;
        int c=0;
        if(i==j){
            ans[0] = arr[i];
            i--;
            j++;
            c++;
        }
        while(i>=0 && j<n && c<k){
            if(Math.abs(arr[i]-x) < Math.abs(arr[j]-x)){
                ans[c] = arr[i];
                i--;
            }else{
                ans[c] = arr[j];
                j++;
            }
            c++;
        }
        while(i>=0 && c<k){
            ans[c] = arr[i];
            c++;
            i--;
        }
        while(j<n && c<k){
            ans[c] = arr[j];
            c++;
            j++;
        }
        return ans;
    }
    public static int findInd(int arr[], int n, int x){
        int l=0,h=n-1;
        while(l<h && h-l>1){
            int m = (l+h)/2;
            if(arr[m]==x) return m;
            if(arr[m]>x) h=m;
            if(arr[m]<x) l=m;
        }
        return Math.abs(arr[l]-x)<Math.abs(arr[h]-x)?l:h;
    }
}
