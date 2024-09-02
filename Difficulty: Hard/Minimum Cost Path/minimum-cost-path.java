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
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution
{
    class Tuple{
        int row;
        int col;
        int weight;
        
        Tuple(int a,int b,int c){
            this.row=a;
            this.col=b;
            this.weight=c;
        }
    }
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int res[][]=new int[n][n];
        
        for(int num[]:res)Arrays.fill(num,Integer.MAX_VALUE);
        res[0][0]=grid[0][0];
        int direction[][]={{0,1},{0,-1},{-1,0},{1,0}};
        
        PriorityQueue<Tuple>pq=new PriorityQueue<>((Tuple a,Tuple b)->Integer.compare(a.weight,b.weight));
        pq.add(new Tuple(0,0,grid[0][0]));
        while(!pq.isEmpty()){
            Tuple tuple=pq.poll();
            int row=tuple.row;
            int col=tuple.col;
            int weight=tuple.weight;
            
            for(int dir[]:direction){
                int row_=row+dir[0];
                int col_=col+dir[1];
                if(row_>=0&&col_>=0&&row_<n&&col_<n&&(res[row_][col_]>weight+grid[row_][col_])){
                    res[row_][col_]=weight+grid[row_][col_];
                    pq.add(new Tuple(row_,col_,res[row_][col_]));
                }
            }
        }
        return res[n-1][n-1];
    }
}