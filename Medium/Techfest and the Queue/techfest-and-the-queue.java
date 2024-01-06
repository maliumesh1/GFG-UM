//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        boolean[]Nprime=new boolean[(int)(b+1)];
        Nprime[0]=true;
        Nprime[1]=true;
        seive(Nprime);
        int cost=0;
        for(int i=(int)a;i<=(int)b;i++){
            if(Nprime[i]==false){
                cost++;
            }
            else{
                
            
            int take=(int)i;
            int fl=0;
            for(int j=2;j*j<=i;j++){
                if(take%j==0){
                    while(take%j==0){
                        cost=cost+1;
                        take=take/j;
                        fl++;
                    }
                }
            }
            if( take>=2){
                cost=cost+1;
            }
            }
            
        }
        
        return (long)cost;
    }
    
    public static void seive(boolean[]Nprime){
        int n = Nprime.length;
        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2*i;j<n;j=j+i){
                if(!Nprime[j]){
                    Nprime[j]=true;
                }
            }
        }
    }
}