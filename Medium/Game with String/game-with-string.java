//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
          int n = s.length();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++)   
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int count: map.values())
            queue.offer(count);
            
        while(k>0 && !queue.isEmpty())
        {
            int count = queue.poll();
            count--;
            if(count>0) 
                queue.offer(count);
            k--;
        }
        
        int square = 0;
        while(!queue.isEmpty())
        {
            int count = queue.poll();
            square+=count*count;
        }
        
        return square;
    }
}