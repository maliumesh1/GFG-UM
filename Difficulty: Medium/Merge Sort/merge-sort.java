//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1 = m - l + 1;
         int n2 = r - m;
         
         int[] a1 = new int[n1];
         int[] a2 = new int[n2];
         
         for (int i = 0; i < n1; i++) {
             a1[i] = arr[l + i];
         }
         for (int j = 0; j < n2; j++) {
             a2[j] = arr[m + 1 + j];
         }
         
         int i = 0, j = 0, k = l;
         while (i < n1 && j < n2) {
             if (a1[i] <= a2[j] ) {
                 arr[k] = a1[i];
                 i++;
             } else {
                 arr[k] = a2[j];
                 j++;
             }
             k++;
         }
         while (i < n1) {
             arr[k] = a1[i];
             k++;
             i++;
         }
         
         while (j < n2) {
             arr[k] = a2[j];
             k++;
             j++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        //base case
        if (l >= r) {
            return;
        }
        
        int mid = l + (r - l)/2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        
        merge(arr,l, mid, r);
    }
}