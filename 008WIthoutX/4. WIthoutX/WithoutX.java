/** 
 * CodingBat.com activity from String1
 */

public class WithoutX
{
  public static String withoutX(String str)
  {
    return str.replaceAll("^x|x$", "");
  }
}  