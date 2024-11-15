//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
     HashSet<Integer> hm=new HashSet<>();
        for(int i:arr){
            hm.add(i);
        }
        if(hm.size()==1){
            return -1;
        }
        int k=0;
        int A[]=new int[hm.size()];
        for(int i:hm){
            A[k++]=i;
        }
        Arrays.sort(A);
        int n=A.length;
      
        return A[n-2];
        
    }
}