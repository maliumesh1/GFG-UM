//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        int n = s.length();
        int maxLength = 0;
        
        // HashMap to store the last position of each character.
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        // Left pointer of the window.
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the window, move the left pointer.
            if (charIndexMap.containsKey(currentChar)) {
                // Move the left pointer to the right of the previous occurrence.
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the last seen index of the current character.
            charIndexMap.put(currentChar, right);
            
            // Calculate the window length and update maxLength if needed.
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}