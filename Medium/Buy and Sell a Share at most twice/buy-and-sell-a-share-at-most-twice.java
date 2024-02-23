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
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n <= 1) {
            return 0;
        }
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        int minPrice1 = price[0];
        for (int i=1;i<n;i++) {
            minPrice1 = Math.min(minPrice1, price[i]);
            profit1[i] = Math.max(profit1[i - 1], price[i] - minPrice1);
        }
        int maxPrice2 = price[n - 1];
        for (int i=n-2;i>=0;i--) {
            maxPrice2 = Math.max(maxPrice2, price[i]);
            profit2[i] = Math.max(profit2[i + 1], maxPrice2 - price[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, profit1[i] + (i + 1 < n ? profit2[i + 1] : 0));
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int n1 = 6;
        int[] prices1 = {10,22,5,75,65,80};
        System.out.println(maxProfit(n1, prices1));
        int n2 = 7;
        int[] prices2 = {2,30,15,10,8,25,80};
        System.out.println(maxProfit(n2, prices2));
    }
}