import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * CodingBat Java Activity "only14" from Array-2 section.
 * codingbat.com
 */

public class Only14 
{
	public static boolean only14(int[] nums)
	{
		return Pattern.matches("((?<=[,\\[])\\s?[14](?=[\\],])|[\\[,\\]](?!]))*",Arrays.toString(nums));
	}
}

