//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,List<int[]>> map = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                if(!map.containsKey(sum))   map.put(sum,new ArrayList<>());
                map.get(sum).add(new int[]{i,j});
            }
        }
        
        for(int i=0;i<n;i++){
            if(map.containsKey(-arr[i])){
                for(int[] it:map.get(-arr[i])){
                    // if(it[0]==i || it[1]==i)    continue;
                    if(i<it[0]) ans.add(Arrays.asList(i,it[0],it[1]));
                }
            }
        }
        
        return ans;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            List<List<Integer>> res = obj.findTriplets(nums);
            Collections.sort(res, (a, b) -> {
                for (int i = 0; i < a.size(); i++) {
                    if (!a.get(i).equals(b.get(i))) {
                        return a.get(i) - b.get(i);
                    }
                }
                return 0;
            });
            if (res.size() == 0) {
                System.out.println("[]");
            }
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends