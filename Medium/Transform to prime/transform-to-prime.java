//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum=0;
        for(int i: arr) sum+=i;
        for(int k=0;k<sum;k++)
        {
            int div=0;  // n0. of divisors
            for(int i=2;i*i<=sum+k ; i++) 
            {
                if(( sum+k)%i==0)
                {
                    div++;
                    break;
                }
            }
            if(div==0) return k; // if no. of divisor is 0 , (sum+k) must be prime
        }
       return 0; 
    }
}
