//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getPrimes(n);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends

class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here

//Initialization of the prime array:
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        ArrayList<Integer> ans = new ArrayList<Integer>();

//This loop implements the Sieve of Eratosthenes algorithm to mark non-prime numbers.
        for(int i=2; i*i<=n; i++){
            if(prime[i])
            {
                for(int j=i*i; j<=n; j+=i)prime[j] = false;
            }
        }

//Finding the two prime numbers:
        for(int i=2; i<=n; i++){
            if(prime[i] && prime[n-i]){
                ans.add(i);
                ans.add(n-i);
                return ans;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
        
    }
}