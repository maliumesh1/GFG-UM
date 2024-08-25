//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getVol(A,B));
        }
    }
}
// } Driver Code Ends




class Solution {
    static long getVol(int A, int B) {
        // code here
         double p = (double)A;
        double s = (double)B;
        
        double v = (36*p*s - Math.pow(p, 3) + Math.sqrt(Math.pow((p*p - 24*s), 3))) / (12*72);
		long ans  =  (long)(v);
		if (ans<0)
            ans=0;
		return ans;
    }
};