//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.size();i++){
            if(!mp.containsKey(nums.get(i))){
                mp.put(nums.get(i),1);
            }
            else{
                mp.put(nums.get(i),mp.get(nums.get(i))+1);
            }
        }
        for(int i=0;i<nums.size();i++){
            if(mp.get(nums.get(i)) > nums.size()/3){
                if(!li.contains(nums.get(i))) li.add(nums.get(i));
            }
        }
        if(li.isEmpty()) li.add(-1);
        return li;
    }
}