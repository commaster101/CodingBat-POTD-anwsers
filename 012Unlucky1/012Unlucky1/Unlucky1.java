
import java.util.Arrays;
import java.util.regex.Pattern;


/**
 * CodingBat Java Activity "unlucky1" from Array-1.
 * codingbat.com
 */

public class Unlucky1
{
	public static boolean unlucky1(int[] nums)
	{
		//return Pattern.compile("(^\\[1, 3)|(^\\[., 1, 3)|(1, 3]$)").matcher(Arrays.toString(nums)).find(); //this is prob faster because we dont match whole string :p
		return Pattern.matches("(^\\[.?.?.?1, 3).*|(.*1, 3]$)", Arrays.toString(nums));
	}

	public static void main(String[] args)
	{
		System.out.println();
	}
}
