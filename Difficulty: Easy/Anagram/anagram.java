//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2) return false;
        int[] arr = new int[26];
        for(int i=0;i<l1;i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<l2;j++){
            if(arr[s2.charAt(j)-'a']<1)return false;
            arr[s2.charAt(j)-'a']--;
        }
        return true;
    }
}

