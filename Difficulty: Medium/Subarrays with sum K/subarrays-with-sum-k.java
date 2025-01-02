//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int res = new Solution().countSubarrays(arr, k);

            System.out.print(res);
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public int countSubarrays(int arr[], int k) {
        int N = arr.length, cnt = 0, sum = 0, val = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // adding 0 in the map if we get k as prefix sum
        hm.put(0, 1);
        for(int i = 0; i < N; i++) {
            sum += arr[i];
            // checking for all previous indexes if the (sum - k) value exists
            // as it would give a subarray with required val
            val = sum - k;
            if(hm.containsKey(val)) {
                cnt += hm.get(val);
            }
            // adding prefix sum in map
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}