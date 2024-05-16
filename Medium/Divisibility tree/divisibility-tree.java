//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
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

            int[][] edges = IntMatrix.input(br, n - 1, 2);

            Solution obj = new Solution();
            int res = obj.minimumEdgeRemove(n, edges);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    static int ans=0;
    
    int wrk(ArrayList<ArrayList<Integer>>al,  int vs[], int i){
        vs[i]=1;
        int sz=1;
        for(int s:al.get(i)){
            if(vs[s]==0){
                int t=wrk(al,vs,s);
                sz+=t;
                if(t%2==0)ans++;
                
            }
            
        }
        return sz;
        
    }
    public int minimumEdgeRemove(int n, int[][] edges) {
        ans=0;
        ArrayList<ArrayList<Integer>> al= new ArrayList<>();
        for(int i=0;i<=n;i++){
            al.add(new ArrayList<>());
            
        }
        for(int i[]:edges){
            al.get(i[0]).add(i[1]);
            al.get(i[1]).add(i[0]);}
            
            int vs[]= new int[n+1];
            for(int i=1;i<vs.length;i++){
                if(vs[i]==0){
                    wrk(al,vs,i);
                }
                
            }
            return ans;
    }
}