//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    String roundToNearest(String s) {
        // Complete the function
        //        Case 1. if last digit of given String is less than 5 , then replace the last digit with 0
        int n = s.length();
        if (s.charAt(n - 1) <= '5') {
            return s.substring(0, n - 1)+"0";
        }

//        case 2. lest s="9998" => output ="10000"
//        replace 8 with 0 then , check each character if it is 9 then replace with 0
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(n - 1, '0');
        int i = n - 2;
        while (i >= 0 && str.charAt(i) == '9') {
            str.setCharAt(i, '0');
            --i;
        }
        if (i < 0) {
            // insert 1
            str.insert(0, '1');
        } else { // case 3. s="29" then output "30" , replace last digit with 0 and increment 1 by second last digit
            str.setCharAt(i, (char) (s.charAt(i)+ 1));
        }
        return str.toString();
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends