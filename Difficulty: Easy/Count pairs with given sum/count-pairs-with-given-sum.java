//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends


class Solution {

    int countPairs(int arr[], int target) {
        Hashtable<Integer, Integer> freq = new Hashtable<>();
        int count = 0;
        
        for (int num: arr) {
            if (freq.containsKey(target - num)) count += freq.get(target - num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }
}
 


//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends