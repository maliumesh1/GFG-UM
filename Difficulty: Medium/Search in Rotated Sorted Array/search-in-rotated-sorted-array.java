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

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int search(int[] arr, int target) {
        // Complete this function
        int piv = pivot(arr);
        //If we don't find the pivot, it's mean the array is not rotated
        if(piv == -1){ return bs(arr, target, 0, arr.length-1);}
        //If pivot is equals to target the return the pivot
        if(arr[piv] == target){ return piv; }
        if(arr[0] <= target){ return bs(arr,target,0,piv-1); }
        return bs(arr,target,piv+1,arr.length-1);
        //return -1;
    }
     int bs(int[]arr, int target, int s, int e){
        while (s<=e){
            int mid = s+(e-s)/2;
            if(target == arr[mid]) {return mid;}
            else if (target < arr[mid]) {e=mid-1;}
            else{s=mid+1;}
        }
        return -1;
    }
     int pivot(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            //Doing this check because if array at in last index and check for next it will gave index out of bound
            if (mid < e && arr[mid] > arr[mid + 1]) return mid;
            if (mid > s && arr[mid] < arr[mid - 1]) return mid-1;
            if (arr[mid] <= arr[s]) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }
}