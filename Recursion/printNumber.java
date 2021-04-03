/**Hey,So this is my first ever program in Recursion . 
Well To maintain consistancy with DSA and Java I have 
started a new journey to take a challenge to solve some problems
everyday . 
****
So hey, This is sonali and welcome to my Git hub Repo.
Today I am starting with Recursion.
****
PROBLEM STATEMENT:
1.Print numbers from 1 to N without the help of loops.

Example 1:

Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10

Example 2:

Input:
N = 5
Output: 1 2 3 4 5

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).

Constraints:
1 <= N <= 105

*******
SOLUTION-
**/
import java.io.*;
import java.lang.*;
import java.util.*;
public class printNumber
{
	static void printNos(int N)
    {
      if(N == 0)
      return;
      else
        {
            printNos(N-1);
            System.out.print(N+" ");
        }   
    }
	public static void main(String[]args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine();
		int N = Integer.parseInt(S);
		printNos(N);
	}
}