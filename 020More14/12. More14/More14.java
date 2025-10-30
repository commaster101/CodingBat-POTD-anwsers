import java.util.Arrays;

/*
 * CodingBat Java Activity "more14" from Array-2 section.
 * codingbat.com
 */

public class More14 
{
	public static boolean more14(int[] nums)
	{
		return Arrays.toString(nums).replaceAll("[^1]", "").length() >
			   Arrays.toString(nums).replaceAll("[^4]", "").length();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

