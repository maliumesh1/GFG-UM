//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
  static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int N = arr.length;
        int i = 0, j = 1, cnt = 0;
        while(j < N) {
            int k = j + 1;
            while(k < N) {
                if((arr[i]+arr[j])>arr[k]) {
                    cnt+=1;
                    k+=1;
                }
                else {
                    
                    j += 1;
                    k = j+1;
                }
                if(k == N) {
                  j += 1;
                  k = j + 1;
                }
            }
            i += 1;
            j = i+1;
        }
        return cnt;
    }
}