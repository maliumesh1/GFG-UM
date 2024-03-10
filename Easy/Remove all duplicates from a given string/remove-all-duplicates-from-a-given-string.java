//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
             String s="";

        

        //LinkedHashSet is ordered and no duplicates are allowed 

         LinkedHashSet<Character>set = new LinkedHashSet<Character>();

            int n=str.length();

            for(int i=0;i<n;i++){

                set.add(str.charAt(i));

            }

            //For each Loop

           for(char ch:set){

               s+=ch;

           }
return s;

    }
}

