//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends


class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        
        if(d == 1 && s > 9) return "-1";
        
        if(d == 1 && s <= 9) return s+"";
        
        while(i < d)
        {
            if(s > 9)
            {
                sb.append(9);
                s -= 9;
                i++;
            }
            else
            {
                if(i == d-1){
                    sb.insert(0,s);
                    return sb.toString();
                } 
                sb.insert(0,s-1);
                i++;
                while(i < d-1)
                {
                    sb.insert(0,0);
                    i++;
                }
                if(i < d)  sb.insert(0,1);
                
                return sb.toString();
            }
        }
        
        if(s != 0) return "-1";
        
        return sb.toString();
    }
}
