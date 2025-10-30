import java.util.Arrays;

/*
 * CodingBat Java Activity "bigDiff" from Array-2 section.
 * codingbat.com
 */

public class BigDiff 
{
	public static int bigDiff(int[] nums)
	{
		Arrays.sort(nums);
		return nums[nums.length-1]-nums[0];
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

