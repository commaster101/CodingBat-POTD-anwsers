/*
 * CodingBat Java Activity "fizzArray" from Array-2 section.
 * codingbat.com
 */

public class FizzArray 
{	
	public static int[] fizzArray(int nums)
	{
		int[] out = new int[nums];
		for (int i = 0; i < nums; i++)
		{
			out[i] = i;
		}
		return out;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
  }
}

