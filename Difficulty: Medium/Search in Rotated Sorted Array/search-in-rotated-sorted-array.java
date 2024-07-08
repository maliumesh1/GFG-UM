//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
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

            int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().search(arr, key));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        int left=0,right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            
            if(arr[mid]==key)return mid;
            
            //check if left part is sorted
            if(arr[mid]>=arr[left]){
                //minimize the search space
                if(arr[mid]>key && key>=arr[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
             //if left part is not sorted, then definitely right part is sorted. 
            else{
                //minimize the search space
                if(arr[mid]<key && key<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}