//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public int maxDistance(int[] arr) {
        // Initialize a HashMap to store the first occurrence of each element in the array
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Variable to store the maximum distance between two occurrences of the same element
        int max = 0;
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {  // If the current element has been seen before (exists in the map)
               
                max = Math.max(max, i - mp.get(arr[i])); // // Calculate the distance between the current index and the first occurrence of the element
                // Update the maximum distance if the new distance is larger
            } 
            // If the current element is seen for the first time, store its index in the map
            else {
                mp.put(arr[i], i);
            }
        }
        
        // Return the maximum distance found
        return max;
    }
}



//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends