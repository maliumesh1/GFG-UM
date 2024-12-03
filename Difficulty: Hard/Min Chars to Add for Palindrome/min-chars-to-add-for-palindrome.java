//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    
    public static int[] computeLPS(String s){
        int n = s.length();
        
        int pre = 0;
        int suff = 1;
        
        int []lps = new int[n];
        
        while(suff < n){
            if(s.charAt(pre) == s.charAt(suff)){
                pre ++;
                lps[suff] = pre;
                suff ++;
            }
            else{
                if(pre == 0){
                    lps[suff] = 0;
                    suff ++;
                }
                else{
                    pre = lps[pre-1];
                }
            }
        }
        
        return lps;
    }
    public static int minChar(String s) {
        // Write your code here
        String reverse = new StringBuilder(s).reverse().toString();
        String concat = s + "#" + reverse;
        
        int []lps = computeLPS(concat);
        
        return s.length() - lps[lps.length - 1];
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.nextString();
            System.out.println(Solution.minChar(s));

            System.out.println("~");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException {
            while (!st.hasMoreTokens()) read();
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends