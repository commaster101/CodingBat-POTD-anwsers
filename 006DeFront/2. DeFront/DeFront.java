/**
 * CodingBat.com activity from String1
 */

public class DeFront
{
  public static String deFront(String str)
  {
    return str.replaceAll("^[^a][^b]|(?<=^.)[^b]|^[^a]","");
    /*if (str.startsWith("ab")) return str;
    if (str.startsWith("a")) return "a"+str.substring(2);
    if (str.charAt(1) == 'b') return str.substring(1);
    return str.substring(2);*/
  }
}