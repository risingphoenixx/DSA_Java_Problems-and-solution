/**PROBLEM STATEMENT:
3.Print numbers from N to 1 without the help of loops.

Example 1:

Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

Example 2:

Input:
N = 5
Output: 5 4 3 2 1

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraints:
1 <= N <= 105

*******
SOLUTION-
**/
import java.util.*;
import java.io.*;
import java.lang.*;
public class printReverse
{
	static void printNos(int N)
	{
		if(N==0)
			return;
		else
		{
			System.out.print(N +" ");
		    printNos(N-1);
		}	
	}
	 public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine();
		int N = Integer.parseInt(S);
		printNos(N);
	}
}