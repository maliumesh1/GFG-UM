//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Step 1: Sort the array to use the two-pointer approach effectively
        Arrays.sort(arr); 
        
        int n = arr.length; // Get the size of the array
        int low = 0;        // Initialize the low pointer to the start of the array
        int high = n - 1;   // Initialize the high pointer to the end of the array
        int count = 0;      // Initialize a counter to keep track of valid pairs

        // Step 2: Use the two-pointer approach to find pairs
        while (low < high) { 
            // If the sum of the elements at low and high pointers is less than the target
            if (arr[low] + arr[high] < target) {
                // All pairs from 'low' to 'high - 1' with 'arr[low]' as one element
                // will satisfy the condition
                count += (high - low);

                // Move the low pointer to consider the next element
                low++; 
            } else {
                // If the sum is greater than or equal to the target, decrement the high pointer
                // to reduce the sum
                high--; 
            }
        }

        // Step 3: Return the total count of valid pairs
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