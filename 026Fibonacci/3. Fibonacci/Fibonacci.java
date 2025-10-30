/*
 * CodingBat Java Activity "fibonacci" from Recursion-1 section.
 * codingbat.com
 */

import java.util.stream.Stream;

public class Fibonacci 
{

	public static int fibonacci(int n)
	{
		return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).mapToInt(t -> t[0]).limit(n+1).skip(n).findFirst().orElse(0);
	}

	public static int fibonacci(int n, boolean Recursion)
	{
		if (Recursion == false) return fibonacci(n);
		return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}

	
	public static void main(String[] args)
	{
		System.out.println();
	}
}
