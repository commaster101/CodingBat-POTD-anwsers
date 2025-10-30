import java.util.Arrays;
/*
 * CodingBat Java Activity "centeredAverage" from Array-2 section.
 * codingbat.com
 */

public class CenteredAverage 
{
	public static int centeredAverage(int[] nums)
	{
		//"normal way"
		/*Arrays.sort(nums);
		nums[0] = 0;
		for (int i : Arrays.copyOfRange(nums, 1, nums.length-1)) nums[0] += i;
		return nums[0]/(nums.length-2);*/
		
		//minimun numbers of lines
		Arrays.sort(nums);
		return (int)Arrays.stream(Arrays.copyOfRange(nums, 1, nums.length-1)).average().orElse(0);
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}

