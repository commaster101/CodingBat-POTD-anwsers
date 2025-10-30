import java.util.Arrays;

/*
 * CodingBat Java Activity "lucky13" from Array-2 section.
 * codingbat.com
 */

public class Lucky13 
{
	public static boolean lucky13(int[] nums)
	{
		return Arrays.toString(nums).matches("[^13]*");
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

