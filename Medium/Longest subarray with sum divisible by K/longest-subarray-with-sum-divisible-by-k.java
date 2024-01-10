//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k) {
        // Create a HashMap to store the remainder of the cumulative sum
        // and its corresponding index
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        
        // Initialize variables for tracking cumulative sum and the maximum length
        int cumSum = 0;
        int maxLength = 0;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            cumSum += a[i];
            
            // Calculate the remainder when divided by K (taking care of negative numbers)
            int remainder = ((cumSum % k) + k) % k;
            
            // If remainder is 0, update maxLength to current index + 1
            if (remainder == 0) {
                maxLength = i + 1;
            } else {
                // Check if the remainder already exists in the HashMap
                if (remainderMap.containsKey(remainder)) {
                    // If it does, update maxLength to the difference between current index and stored index
                    maxLength = Math.max(maxLength, i - remainderMap.get(remainder));
                } else {
                    // If remainder is not in the HashMap, store it along with the current index
                    remainderMap.put(remainder, i);
                }
            }
        }
        
        return maxLength;
    }
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends