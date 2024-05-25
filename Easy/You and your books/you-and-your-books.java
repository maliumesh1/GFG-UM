//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int k = sc.nextInt();
            int ar[] = new int[N];
            //	int count = 0;
            for (int i = 0; i < N; i++) ar[i] = sc.nextInt();

            System.out.println(new Solution().max_Books(ar, N, k));
            T--;
        }
    }
}
// } Driver Code Ends



class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
          Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        long res = 0;
        long count = 0;
        while(!st.isEmpty()){
            if(st.peek() <= k){
                count += st.pop();
            }
            else{
                st.pop();
                count = 0;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}