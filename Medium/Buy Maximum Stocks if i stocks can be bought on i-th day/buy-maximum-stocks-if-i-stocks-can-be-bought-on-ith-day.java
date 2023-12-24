//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
   static class Pair {
        int day, price;
        Pair(int price, int day) {
            this.price = price;
            this.day = day;
        }
    }
    
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        ArrayList<Pair> stock = new ArrayList<>();
        for(int i = 0; i < n; i++) stock.add(new Pair(price[i], i+1));
        
        Collections.sort(stock, (a, b)->{
            return a.price - b.price;
        });
        int cnt = 0;
        for(Pair st: stock) {
            int day = st.day;
            int pr = st.price;
            
            if(pr*day < k) {
                cnt += day;
                k -= pr*day;
            }else {
                cnt += (int)(k/pr);
                break;
            }
        }
        return cnt;
    }
}
        
