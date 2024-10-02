//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {

    // Function to right rotate the array by 1 position
    public static void rightRotate(ArrayList<Integer> arr) {
        int last = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);  // Remove the last element
        arr.add(0, last);  // Insert it at the beginning
    }

    // Method to perform the required operations
    public static int rotateDelete(ArrayList<Integer> arr) {
        int sz = arr.size();
        int operations = sz / 2;

        for (int k = 1; k <= operations; k++) {
            // Step 1: Right rotate the array
            rightRotate(arr);

            // Step 2: Remove the (n - k + 1)-th element from the beginning
            int n = arr.size();
            int indexToRemove = n - k;  // (n - k + 1)-th element in 1-based, so -1 for 0-based index
            arr.remove(indexToRemove);  // Remove the element directly
        }

        // After all operations, return the first element
        return arr.get(0);
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> arr = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }

            Solution obj = new Solution();
            int res = obj.rotateDelete(arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends