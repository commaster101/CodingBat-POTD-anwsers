/*
 * CodingBat Java Activity "bunnyEars" from Recursion-1 section.
 * codingbat.com
 */

public class BunnyEars 
{
	public static int bunnyEars(int bunnies)
	{
		return (bunnies << 1);

		/*
		 * with recursion
		 * if (bunnies == 0)
		 *    return 0;
		 * else
		 *   return 2 + bunnyEars(bunnies - 1); 
		 */
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}
