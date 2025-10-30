/*
 * CodingBat.com activity from String2.
 */
public class XYBalance
{
  public static boolean xyBalance(String str)
  {
    return str.matches("[^x]*x*(?=.*y[^x]*$).*|[^x]*");
  }
  public static void main(String[] args)
  {
    System.out.println(xyBalance("bybbbb"));
  }
}