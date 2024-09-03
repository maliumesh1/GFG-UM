//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr1 = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr1.add(lineScanner.nextInt());
            }
            lineScanner.close();

            List<Integer> arr2 = new ArrayList<>();
            input = sc.nextLine();
            lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr2.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.maxPathSum(arr1, arr2);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        
        int n1 = arr1.size(), n2 = arr2.size();
        
        int totalSum = 0, sum1 = 0, sum2 = 0;
        
        int i = 0, j = 0;
        while(i < n1 || j < n2){
            
            int a = i < n1 ? arr1.get(i) : Integer.MAX_VALUE;
            int b = j < n2 ? arr2.get(j) : Integer.MAX_VALUE;
            
            if(a < b){
                sum1 += a;
                i++;
            }else if(b < a){
                sum2 += b;
                j++;
            }else{
                totalSum += Math.max(sum1, sum2) + a;
                sum1 = 0;
                sum2 = 0;
                i++; j++;
            }
            
            //System.out.println(sum1 + " " + sum2);
        }
        return totalSum + Math.max(sum1 , sum2);
    }
}