//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());

        while (testCases-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            Solution ob = new Solution();
            List<Integer> result = ob.findSplit(arr);

            if (result.get(0) == -1 && result.get(1) == -1 || result.size() != 2) {
                System.out.println("false");
            } else {
                int sum1 = 0, sum2 = 0, sum3 = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i <= result.get(0))
                        sum1 += arr[i];

                    else if (i <= result.get(1))
                        sum2 += arr[i];

                    else
                        sum3 += arr[i];
                }
                if (sum1 == sum2 && sum2 == sum3) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        
        
        List<Integer> list = new ArrayList<>();
        int total = Arrays.stream(arr).sum();
        
        if(total%3!=0){
            list.add(-1);
            list.add(-1);
            return list;
        }
        
        int s =0;
        int result = total/3;
        
        for(int i =0;i<arr.length;i++){
            s+=arr[i];
            if(s==result){
                s=0;
                list.add(i);
            }
            if(list.size()==2){
                return list;
            }
        }
        
        list.add(-1);
        list.add(-1);
        return list;
    }
}