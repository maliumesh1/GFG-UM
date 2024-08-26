//{ Driver Code Starts
import java.util.*;

class WildcardPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String pat = sc.nextLine();
            String text = sc.nextLine();
            Solution g = new Solution();
            System.out.println(g.wildCard(pat, text));
            t--;
        }
    }
}
// } Driver Code Ends

class Solution {
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int n = pattern.length();
        int m = str.length();
        return helper(pattern,str,n,m);
    }
    int helper(String pat,String str,int  n,int m) {
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i = 1;i<n+1;i++) {
            if(pat.charAt(i-1)=='*') {
                dp[i][0] = dp[i-1][0]&&true;
            } else {
                dp[i][0] = false;
            }
        }
        for(int j = 1;j<m+1;j++) {
            dp[0][j] = false;
        }
        
        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<m+1;j++) {
                if(pat.charAt(i-1) == str.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else if(pat.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }else if(pat.charAt(i-1)=='*') {
                    dp[i][j] = dp[i-1][j]||dp[i][j-1];
                }else {
                    dp[i][j] = false;
                }
            }
        }
        if(dp[n][m]) {
            return 1;
        }
        return 0;
    }
}

