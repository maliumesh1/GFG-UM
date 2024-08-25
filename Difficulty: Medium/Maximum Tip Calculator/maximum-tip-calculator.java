//{ Driver Code Starts
import java.io.*;
import java.util.*;

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

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        int[][] temp = new int[n][2];
        for(int i=0;i<n;i++){
            temp[i][0]=Math.abs(arr[i]-brr[i]);
            temp[i][1]=i;
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]>b[0])return 1;
                else if(a[0]<b[0])return -1;
                return 0;
            }
        });
        long ans=0;
        for(int i=n-1;i>=0;i--){
            int index=temp[i][1];
            if(arr[index]>brr[index]){
                if(x!=0){
                    ans+=arr[index];
                    x--;
                }
                else{
                    ans+=brr[index];
                    y--;
                }
            }
            else{
                if(y!=0){
                    ans+=brr[index];
                    y--;
                }
                else{
                    ans+=arr[index];
                    x--;
                }
            }
        }
        return ans;
    }
}