//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.kthMissing(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        HashSet<Integer>st = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            st.add(arr[i]);
        }
        
        int val = 1;
        while(k > 0){
            if(!st.contains(val)){
                k--;
            }
            if(k == 0) return val;
            val=val+1;
        }
        return val;
    }
}