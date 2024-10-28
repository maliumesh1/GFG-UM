//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().removeDuplicate(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        int freq[]=new int [101];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        
        
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(freq[arr[i]]>0)
            {
                freq[arr[i]]=0;
                a.add(arr[i]);
            }
        }
        return a;
    }
}