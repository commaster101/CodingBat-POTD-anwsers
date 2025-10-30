/*
 * CodingBat Java Activity "makeTags" from String-1 section.
 * codingbat.com
 */

public class MakeTags 
{
	public static String makeTags(String tag, String word)
	{
		return String.format("<%1$s>%2$s</%1$s>", tag, word);
	}
	
	public static void main(String[] args)
	{
		System.out.println();
  	}
}