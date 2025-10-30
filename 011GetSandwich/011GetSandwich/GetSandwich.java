/*
 * CodingBat.com activity from String-2.
 */

public class GetSandwich
{
  public static String getSandwich(String str)
  {
    Matcher matcher = Pattern.compile("(?<=bread).*(?=bread)").matcher(str); 
    return matcher.find() ? matcher.group() : "";
  }
}