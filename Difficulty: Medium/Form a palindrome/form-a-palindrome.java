//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        // code here
        if(isPalin(str)) return 0;
        
        int n=str.length();
        int[][] dp=new int[n][n];
        
        for (int gap=1; gap<n; ++gap) {
            for (int i=0, j=gap; j<n; ++i, ++j) {
                if (str.charAt(i)==str.charAt(j)) 
                {
                    dp[i][j]=dp[i+1][j-1];
                } else {
                    dp[i][j]=Math.min(dp[i][j-1], dp[i+1][j])+1;
                }
            }
        }
        
        return dp[0][n-1];
    }
    
    static boolean isPalin(String str)
    {
        StringBuilder temp=new StringBuilder(str);
        return str.equals(temp.reverse().toString());
    }
}

