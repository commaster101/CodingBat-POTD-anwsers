
/*
 * CodingBat Java Activity "sum67" from Array-2 section.
 * codingbat.com
 */

import java.util.Arrays;
import java.util.stream.Stream;

public class Sum67 
{
	public static int sum67(int[] nums)
	{
		return (Arrays.toString(nums).replaceAll("[\\[\\]\\s]", "").replaceAll(",?6.*?7", "").replaceAll("^,", "").equals("")) ? 0 : Stream.of(Arrays.toString(nums).replaceAll("[\\[\\]\\s]", "").replaceAll(",?6.*?7", "").replaceAll("^,", "").split(",")).mapToInt(Integer::parseInt).sum();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

