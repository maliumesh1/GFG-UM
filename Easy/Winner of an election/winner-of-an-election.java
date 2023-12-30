//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
          HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        
        String name = arr[0];
        int maxCount = map.get(arr[0]);
        
        for(int i=1;i<n;i++){
            if(maxCount <= map.get(arr[i]) ){
                if(maxCount == map.get(arr[i])){
                    if (arr[i].compareTo(name) < 0){
                        maxCount = map.get(arr[i]);
                    name = arr[i];
                    }
                } else{
                    maxCount = map.get(arr[i]);
                    name = arr[i];
                }
                
            }
        }
        
        String[] res = new String[2];
        
        res[0] = name;
        res[1] = String.valueOf(maxCount);
        
        return res;
    }
}

