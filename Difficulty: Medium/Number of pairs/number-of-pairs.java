//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int x[] = new int[str.length];
            for (int i = 0; i < str.length; i++) x[i] = Integer.parseInt(str[i]);
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                y[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countPairs(x, y, x.length, y.length));
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public long countPairs(int x[], int y[], int M, int N) {
        Arrays.sort(y);
        int freq[] = new int[5];
        for(int i:y){
            if(i<=4)    freq[i]++;
        }
        
        long ans=0;
        for(int i:x){
            long temp = count(i,y,N,freq);
            // System.out.println(temp);
            ans += temp;
        }
        
        return ans;
    }
    long count(int x,int a[],int n,int freq[]){
        if(x==0)    return 0;
        if(x==1)    return freq[0];
        
        //count greater values (lower_bound)
        int l=0, r=n;
        while(l<r){
            int mid = l+(r-l)/2;
            if(a[mid]<=x)    l=mid+1;
            else    r=mid;
        }
        
        long ans = n-l;
        
        if(x==2)    return ans+freq[0]+freq[1]-freq[3]-freq[4];
        if(x==3)    return ans+freq[0]+freq[1]+freq[2];
        return ans+freq[0]+freq[1];
    }
}