//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
		 int ans =0;
     boolean flag = true;
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        if(i==0 && s.charAt(i)=='-') 
        {
             flag =false;
            continue;
        }
         else if(!Character.isDigit(s.charAt(i)))
        {
         return -1;
        }
        
       else{
         int temp = n-i-1;
         int mul = (int)Math. pow(10, temp);
         ans += (s. charAt(i)-'0') *mul;
         }
      }
      
     if(flag)
     {
     return ans;
      }
      return (int) (-ans) ;
    }
}
