/** 
 * CodingBat.com activity from String1
 */

public class WithoutX2
{
  public static String withoutX2(String str)
  {
    return str.replaceAll("^xx?|(?<=^.)x","");
  }
}  