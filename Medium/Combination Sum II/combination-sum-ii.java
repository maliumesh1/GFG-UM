//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
            List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
            for (List<Integer> list : ans) {
                for (int x : list) ot.print(x + " ");
                ot.println();
            }
            if (ans.size() == 0) ot.println();
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        helper(arr, k, res, new ArrayList<>(), 0, 0);
        return res;
    }
    
    private void helper(int[] arr, int k, List<List<Integer>> res, List<Integer> list, int sum, int ind){
        if(sum > k) return;
        if(sum == k){
            res.add(list);
            return;
        }
        for(int i=ind; i<arr.length; i++){
            if(i > ind && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            sum += arr[i];
            helper(arr, k, res, new ArrayList<>(list), sum, i+1);
            list.remove(list.size()-1);
            sum -= arr[i];
        }
        
    }
}
