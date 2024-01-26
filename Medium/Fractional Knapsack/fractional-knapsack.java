//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class Pair{
    double first;
    int second;
    public Pair(double f , int s){
        first = f;
        second = s;
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.first , a.first));
        
        for(int i = 0 ; i < n ; i++){
            
            pq.offer(new Pair( (double) arr[i].value/ arr[i].weight , arr[i].weight ) );
        }
        
        int curWt = 0 ;
        double profit = 0.0;
        
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            double val = p.first;
            int wt = p.second;
            
            if(curWt + wt <= W){
                curWt += wt;
                profit += (val * wt);
            }
            else {
                int rem = W - curWt;
                profit += (val * rem);
                break;
            }
        }
        return profit;
    }
}