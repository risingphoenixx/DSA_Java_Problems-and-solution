/**
Problem Statement:
2.You are given a number n. You need to find the sum of digits of n.

Example 1:
Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.

Example 2:
Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn) (Recursive).

Constraints:
1 <= n <= 107
****
Solution-
**/
import java.util.*;
import java.io.*;
import java.lang.*;
public class sumDigit
{
	 public static int sumOfDigits(int n)
    {
        if(n == 0)
            return 0;
        else
         return (n%10) + sumOfDigits(n/10);
    }

    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine(); 
		int n = Integer.parseInt(S);
		sumOfDigits(n);
		System.out.print(sumOfDigits(n)+" ");
	}
}