/*
PROBLEM STATEMENT:-
4.You are given a number n. You need to find the count of digits in n.

Example 1:
Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.

Example 2:
Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn).

Constraints:
0 <= n <= 107 

Solution:-
*/
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class countDigits
{
	public static int countDigit(int n)
	{
		if(n/10==0)
			return 1;
		else
			return 1+countDigit(n/10);
	}
	 public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine(); 
		int n = Integer.parseInt(S);
		System.out.print(countDigit(n));
	}
}