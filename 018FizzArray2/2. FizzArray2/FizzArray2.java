/*
 * CodingBat Java Activity "fizzArray2" from Array-2 section.
 * codingbat.com
 */

public class FizzArray2 
{
	public static String[] fizzArray2(int nums)
	{
		String[] out = new String[nums];
		for (int i = 0; i < nums; i++)
		{
			out[i] = String.valueOf(i);
		}
		return out;
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

