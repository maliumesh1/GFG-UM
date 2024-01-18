//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            
            int gallery[] = new int[n];
            for(int i=0; i<n; i++)
                gallery[i] = Integer.parseInt(s[i]);
            Solution T = new Solution();
            out.println(T.min_sprinklers(gallery,n));
        }
		out.close();
		
	}
}





// } Driver Code Ends


//User function Template for Java

class Solution
{
    int min_sprinklers(int[] A, int N)
    {
        // range in which sprinklers are attached
        // for every position, it will store the right end of water sprinkle
        // if i position is left end
        int[] range = new int[N];
        Arrays.fill(range, -1);

        for(int i=0; i<N; ++i) {
            
            // no sprinkler? then no left or right end
            if(A[i] == -1)
                continue;
            
            // st -> left end of the current sprinkler in the range
            // end -> right end of the current sprinkler in the range
            int st = Math.max(0, i-A[i]);
            int end = Math.min(N, i+A[i]);
            
            // So, lets store the maximum right end for left end
            range[st] = Math.max(range[st], end);
        }
        
        // res -> count of sprinklers turned on
        // cur -> Currenly, we are inside a range which end on cur
        // next -> If we are out of cur, what will be the next range to follow?
        int res = 0, cur = -1, next = -1;
        
        // iterating in range
        for(int i=0; i<N; ++i) {
            
            // highest end we can reach from current pos
            next = Math.max(next, range[i]);
            
            // if we get out of current range of active sprinkler
            // move to next sprinkler incrementing the cnt of res
            if(i > cur) {
                ++res;
                cur = next;
            }
            
            // if we out of sprinkler range and this pointer is -1, means
            // not the left end of any, then no water sprinkle here so return -1
            if(i > cur && range[i] == -1)
                return -1;
        }
        
        // return count of active sprinkers
        return res;
    }
}