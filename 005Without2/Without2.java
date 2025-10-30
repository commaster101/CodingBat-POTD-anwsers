/*
 * Codingbat.com activity from String1.
 */

public class Without2
{
  public static String without2(String str)
  {
    return str.replaceAll("((^..)(?=.*\\2$))|(^..$)|((^.)\\5)(?=\\5$)","");
  }
}