//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends

class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i = 1; i<n; i++){
            int j = i-1;
            int num = 0;
            while(j>=0){
                if(arr[j]<arr[i]){
                    num = arr[j];
                    break;
                }
                j--;
            }
            left[i] = num;
        }
        
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    right[i] = arr[j];
                    break;
                }
            }
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            int abs = Math.abs(left[i]- right[i]);
            max = Math.max(max, abs);
        }
        return max;
    }
}