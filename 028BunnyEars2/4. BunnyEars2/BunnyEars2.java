/*
 * CodingBat Java Activity "bunnyEars2" from Recursion-1 section.
 * codingbat.com
 */

public class BunnyEars2 
{
	public static int bunnyEars2(int bunnies)
	{

		return (bunnies << 1) + (bunnies >> 1);

		/*
		if (bunnies == 0)
			return 0;
		else if (bunnies % 2 == 0)
			return 3 + bunnyEars2(bunnies - 1);
		else
			return 2 + bunnyEars2(bunnies - 1);
		*/
	}
	
	public static void main(String[] args)
	{
		System.out.println();
  }
}
