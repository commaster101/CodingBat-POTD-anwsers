import java.util.Arrays;

/*
 * CodingBat Java Activity "countEvens" from Array-2 section.
 * codingbat.com
 */

public class CountEvens 
{
	public static int countEvens(int[] nums)
	{
		return Arrays.toString(nums).replaceAll("[^24680]|[24680](?=\\d)", "").length();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

