//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        
        if (n<=1) return 0;
        if (arr[0] == 0) return -1;
        int step=0;
        int jump=0;
        int nextmove=0;
        
        for(int i=0;i<n;i++){
            nextmove=Math.max(nextmove,i+arr[i]);
            if(i==step){
               jump++;
                step=nextmove;
                if(step>=n-1) return jump;
            }
        }
        return -1;
    }
}