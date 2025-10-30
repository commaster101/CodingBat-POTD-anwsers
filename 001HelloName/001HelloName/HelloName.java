/*
 * CodingBat Java Activity "helloName" from String-1 section.
 * codingbat.com
 */

public class HelloName 
{
	public static String helloName(String name)
	{
		return "Hello "+name+"!";
	}
	
	public static void main(String[] args)
	{
		System.out.println(helloName(args[0]));
	}
}
