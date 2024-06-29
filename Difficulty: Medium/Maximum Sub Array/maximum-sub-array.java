//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(n, a);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int n,int a[]) {
        int i=0,j=0,max=-1,sum=0,maxlen=0,start=-1,end=-1;
        for(i=0;i<a.length;i++){
            if(a[i]>=0){
                sum+=a[i];
                if(sum>max){
                    max=sum;
                       maxlen=i-j+1;
                       start=j;end=i;
                }
                else if(sum==max){
                    if(i-j+1>maxlen){
                        start=j;end=i;
                    }
                }
            }
            else{
                j=i;
                j++;
                sum=0;
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int x=start;x<=end;x++){
            al.add(a[x]);
        }
        return al;
    }
}