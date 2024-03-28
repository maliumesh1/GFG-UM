//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] adj = new int[m][3];

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < 3; j++) {
                    adj[i][j] = sc.nextInt();
                }
            }

            int dist = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.findCity(n, m, adj, dist);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
          //code here
            int graph[][]=new int[n][n];
        
        for(int a[]:graph)
        {
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        
        for(int i=0;i<edges.length;i++)
        {
            int src=edges[i][0];
            int des=edges[i][1];
            int weight=edges[i][2];
            graph[src][des]=weight;
            graph[des][src]=weight;
        }
        
        for(int i=0;i<n;i++)
        {
            graph[i][i]=0;
        }
        
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(graph[i][k]!=Integer.MAX_VALUE&&graph[k][j]!=Integer.MAX_VALUE)
                    {
                    graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                    }
                }
            }
        }
        
        int minCount=n;
        int bestCity=-1;
        
        for(int i=0;i<n;i++)
        {
            int city=0;
            for(int j=0;j<n;j++)
            {
                if(graph[i][j]<=distanceThreshold)
                {
                    city++;
                }
                
            }
            
            if(city<=minCount)
            {
                minCount=city;
                bestCity=i;
            }
            
        }
        return bestCity;
      }
}
