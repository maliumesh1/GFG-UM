//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends



class Solution 
{
    public ArrayList<String> findPath(int[][] mat) 
    {
        // Your code here
        int n=mat.length;
        ArrayList<String> paths=new ArrayList<>();
        possiblepath(mat,paths,new StringBuilder(),n,0,0);
        
        return paths;
    }
    
    public static void possiblepath(int mat[][],ArrayList<String> paths,StringBuilder sb,int n,int i,int j)
    {
        if(i==n-1 && j==n-1 && mat[i][j]==1)
        {
            paths.add(sb.toString());
            return;
        }
        
        if(i<0 || j<0 || i>=n || j>=n || mat[i][j]==0) return;
        
        mat[i][j]=0;
        
        possiblepath(mat,paths,sb.append("D"),n,i+1,j);
        sb.deleteCharAt(sb.length()-1);
        
        possiblepath(mat,paths,sb.append("L"),n,i,j-1);
        sb.deleteCharAt(sb.length()-1);
        
        possiblepath(mat,paths,sb.append("R"),n,i,j+1);
        sb.deleteCharAt(sb.length()-1);
        
        possiblepath(mat,paths,sb.append("U"),n,i-1,j);
        sb.deleteCharAt(sb.length()-1);
        
        mat[i][j]=1;
        
    }
}