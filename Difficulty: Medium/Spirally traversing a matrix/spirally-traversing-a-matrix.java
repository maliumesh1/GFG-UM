//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][])
    {
        // code here 
         ArrayList<Integer>list=new ArrayList<>();
        int count1=0;
        int row=arr.length;
        int column=arr[0].length;
        int a=0,n=column,p=0;
        int b=1,m=row-1,q=column-1;
        int c=column-1,o=0,r=row-1;
        int d=row-2,s=1,t=0;
        outer:while(true)
        {

            for(int i=a;i<n;i++){
                list.add(arr[p][i]);++count1;
                if(count1==row*column)
                    return list;
            }p++;a++;n--;

            for(int i=b;i<m;i++){
                 list.add(arr[i][q]);
                ++count1;
                if(count1==row*column)
                    return list;
            }q--;b++;m--;

            for(int i=c;i>=o;i--){
                 list.add(arr[r][i]);
                ++count1;
                if(count1==row*column)
                    return list;
            }r--;c--;o++;

            for(int i=d;i>=s;i--){
                 list.add(arr[i][t]);
                ++count1;
                if(count1==row*column)
                    return list;
            }t++;d--;s++;
        }
    }
}