/*
 * CodingBat Java Activity "triangle" from Recursion-1 section.
 * codingbat.com
 */

public class Triangle 
{
	public static int triangle(int rows)
	{
		//return (rows + triangle(rows - 1));
		return (((int)Math.log(1>>rows)+(int)Math.log(1>>rows))>>(int)Math.log(1>>rows));
	}
	
	public static void main(String[] args)
	{
		System.out.println();
	}
}
