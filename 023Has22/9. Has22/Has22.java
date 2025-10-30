import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * CodingBat Java Activity "has22" from Array-2 section.
 * codingbat.com
 */

public class Has22 
{	
	public static boolean has22(int[] nums)
	{
		//return Arrays.toString(nums).contains("2, 2"); //simple way
		return Pattern.matches(".*2, 2.*", Arrays.toString(nums)); //with regex
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

