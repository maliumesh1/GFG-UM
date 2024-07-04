//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
       int maxlen=0;
        int cur=0;
        int K=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            cur=cur+arr[i];
            if (cur == K) {
                maxlen = i + 1;
            }

            if(hm.containsKey(cur-K)){
                int len=i-hm.get(cur-K);
                maxlen=Math.max(len,maxlen);
            }
            if(!hm.containsKey(cur)){
                hm.put(cur,i);
            }
        }
        return maxlen;
    }
}