//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findClosest(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int min=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int diff=(arr[mid]-k);
            if(diff==0)
                return arr[mid];
            else if(diff>0) 
            {
                if(diff<=min)
                {
                    min=diff;
                    ans=arr[mid];
                } 
                high=mid-1;    
            }
            else
            {
                if(Math.abs(diff)<min)
                {
                    ans=arr[mid];
                    
                    min=Math.abs(diff);
                }
                low=mid+1;    
            }
        }
        return ans;
    }
}