/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; i++){
			int X = scanner.nextInt();
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println((A + (100-X)*B)*10);
		}
	}
}
