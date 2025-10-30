import java.util.stream.IntStream;

/*
 * CodingBat Java Activity "sum13" from Array-2 section.
 * codingbat.com
 */

public class Sum13 
{
	public static int sum13(int[] nums)
	{
		return IntStream.range(0, nums.length).map(i -> (i > 0 && nums[i - 1] == 13) || nums[i] == 13 ? 0 : nums[i]).sum();
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

