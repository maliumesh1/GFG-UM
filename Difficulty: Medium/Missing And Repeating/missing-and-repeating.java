//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        int res[]=new int[2];
        int n=arr.length;
       int tmp[]=new int[arr.length+1];
       for(int i=0;i<n;i++)
       tmp[arr[i]]++;
       int x=0,y=0;
       for(int i=1;i<tmp.length;i++)
       {
           if(tmp[i]==0)
           x=i;
           else if(tmp[i]>1)
           y=i;
       }
       res[0]=y;
      res[1]=x;
        return res;
    }
}

