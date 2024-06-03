//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int numberOfConsecutiveOnes(int n) {
        int m=1000000007;long ans=1;int x=0,y=1;
        
        for(int i=3;i<=n;i++){
            ans=(ans*2+x+y)%m;
            x%=m;
            y%=m;
            int t=x;
            x=y;
            y=y+t;
        }
        return (int)ans;
    }
}