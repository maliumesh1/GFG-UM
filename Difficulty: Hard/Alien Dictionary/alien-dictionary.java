//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            Solution ob = new Solution();
            //  System.out.println(T.findOrder(words,k));
            String order = ob.findOrder(words, n, k);
            if (order.length() == 0) {
                System.out.println(0);
                continue;
            }
            if (order.length() != k) {
                System.out.println("INCOMPLETE");
                return;
            }
            String temp[] = new String[n];
            for (int i = 0; i < n; i++) temp[i] = words[i];

            Arrays.sort(temp, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for (int i = 0;
                         i < Math.min(a.length(), b.length()) && index1 == index2;
                         i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }

                    if (index1 == index2 && a.length() != b.length()) {
                        if (a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }

                    if (index1 < index2)
                        return -1;
                    else
                        return 1;
                }
            });

            int flag = 1;
            for (int i = 0; i < n; i++) {
                if (!words[i].equals(temp[i])) {
                    flag = 0;
                    break;
                }
            }

            System.out.println(flag);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
  public String findOrder(String[] dict, int n, int k) {
        // Write your code here
        /*
            My appraoch for solving
            1-convert dictonary to graph
            2-apply topology sort
            3-return ans and if cycle return empty string
        */
        //convert graph
        HashMap<Character,ArrayList<Character>> map=new HashMap<>();
        for(int i=1;i<dict.length;i++){
            String str1=dict[i-1].toLowerCase();
            String str2=dict[i].toLowerCase();
            int s1=0;
            int len = Math.min(str1.length(), str2.length());
            while(s1<len  && str1.charAt(s1)==str2.charAt(s1)){
                s1++;
            }
            if(s1>=len) continue;
            map.computeIfAbsent(str1.charAt(s1),p->new ArrayList<>()).add(str2.charAt(s1));
        }
        // Apply topology sort usinh kahn's algo
        int []inDegree=new int[k];
        for(char i:map.keySet()){
            for(char j:map.get(i)){
                inDegree[j-'a']++;
            }
        }
        String ans="";
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(inDegree[i]==0){
                char ch=(char)(i+'a');
                q.add(ch);
            }
        }
        while(!q.isEmpty()){
            char ch=q.poll();
            ans+=ch;
            if(map.containsKey(ch)){
                for(char j:map.get(ch)){
                     inDegree[j-'a']--;
                     if(inDegree[j-'a']==0){
                         q.add(j);
                     }
                }
            }
        }
        
        if(ans.length()!=k){
            return ""; //if cycle return empty string
        }
        return ans;
    }
}