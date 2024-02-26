//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String>a=new ArrayList<>();
        List<Character>ds=new ArrayList<>();
        int n=s.length();
        func(0,n,s,ds,a);
        Collections.sort(a);
        return a;
    }
    public void func(int ind,int n,String s,List<Character>ds,List<String>a){
        if(ind>=n){
            String p="";
            for(int i=0;i<ds.size();i++){
                p+=ds.get(i);
            }
           if(p.length()>0){
            a.add(p);}
            return ;
        }
        ds.add(s.charAt(ind));
        func(ind+1,n,s,ds,a);
        ds.remove(ds.size()-1);
        func(ind+1,n,s,ds,a);
    }
}