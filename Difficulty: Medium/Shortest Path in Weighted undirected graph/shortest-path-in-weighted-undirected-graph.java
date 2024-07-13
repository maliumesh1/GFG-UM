//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
            int edges[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                s = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(s[0]);
                edges[i][1] = Integer.parseInt(s[1]);
                edges[i][2] = Integer.parseInt(s[2]);
            }

            List<Integer> list = new Solution().shortestPath(n, m, edges);

            ot.println(list.get(0));
            if (list.get(0) != -1 && !check(list, edges)) ot.println(-1);
        }
        ot.close();
    }

    static boolean check(List<Integer> list, int edges[][]) {
        Set<Integer> hs = new HashSet<>();
        Map<Integer, Map<Integer, Integer>> hm = new HashMap<>();
        for (int i = 1; i < list.size(); i++) hs.add(list.get(i));
        for (int x[] : edges) {
            if (hs.contains(x[0]) || hs.contains(x[1])) {
                if (!hm.containsKey(x[0])) hm.put(x[0], new HashMap<>());
                if (!hm.containsKey(x[1])) hm.put(x[1], new HashMap<>());
                hm.get(x[0]).put(x[1], x[2]);
                hm.get(x[1]).put(x[0], x[2]);
            }
        }
        int sum = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (!hm.containsKey(list.get(i)) ||
                !hm.get(list.get(i)).containsKey(list.get(i + 1)))
                return false;
            sum += hm.get(list.get(i)).get(list.get(i + 1));
        }
        return sum == list.get(0);
    }
}

// } Driver Code Ends

class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        
        List<List<int[]>> ars=new ArrayList<>();
        for(int i=0; i<=n; i++){
            ars.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
            int start=edge[0];
            int end=edge[1];
            int weight=edge[2];
            
            ars.get(start).add(new int[]{end,weight});
            ars.get(end).add(new int[]{start,weight});
        }

        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[] dist=new int[n+1];
        int[] prev=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(prev,-1);
        dist[1]=0;

        q.offer(new int[]{1,0});

        while(!q.isEmpty()){
    
            int[] previous=q.poll();
            int prevstart=previous[0];
            int prevdist=previous[1];
            
            for(int[] current: ars.get(prevstart)){
                int end=current[0];
                int currentweight=current[1];
                
                if(dist[end]>prevdist+currentweight){
                   dist[end]=prevdist+currentweight;
                   prev[end]=prevstart;
                   q.offer(new int[]{end,dist[end]});
                }
                
            }
        }
        List<Integer> ans=new ArrayList<>();
        
        if (dist[n] == Integer.MAX_VALUE) {  
            ans.add(-1);
            return ans;
        }
        
        for (int at = n; at != -1; at = prev[at]) {
            ans.add(at);
        }
        Collections.reverse(ans);
        ans.add(0, dist[n]);
        return ans;
    }
}