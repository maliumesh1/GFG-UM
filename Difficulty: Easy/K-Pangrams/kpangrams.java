//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if (obj.kPangram(str, k))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean kPangram(String str, int k) {
        // code here
        Map<Character,Integer>hmp=new HashMap<>();
        int alp=0;
        int ex_alp=0;
        if(str.length()<26)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                if(!hmp.containsKey(str.charAt(i)))
                {
                    hmp.put(str.charAt(i),1);
                    alp++;
                }
                else 
                {
                    hmp.put(str.charAt(i),hmp.get(str.charAt(i))+1);
                    ex_alp++;
                }
            }
        }
        int rem=26-alp;
                                
        if(alp==26)
        {
            return true;
        }
        else if(ex_alp>=rem && rem<=k)
        {
            return true;
        }
        return false;
    }
}

