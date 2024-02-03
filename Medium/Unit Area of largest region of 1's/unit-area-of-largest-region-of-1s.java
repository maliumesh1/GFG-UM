//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
          int area=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                     area=Math.max(area,dfs(grid,i,j));
                }
            }
        }
        return area;
    }
    int dfs(int[][] grid,int i,int j){
        int Arow[]={0,-1,-1,-1,0,+1,+1,+1};
        int Acol[]={-1,-1,0,+1,+1,+1,0,-1};
          
        if(i>=grid.length||i<0||j>=grid[0].length||j<0){
           return 0;
        }
        else if(grid[i][j]==1){
            int area=1;
            for(int p=0;p<8;p++){
               int newi=i+Arow[p];
               int newj=j+Acol[p];
                   grid[i][j]=0;
             area+=dfs(grid,newi,newj);
           }
           return area;
            }
      return 0;
    }
}