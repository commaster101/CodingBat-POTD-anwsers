/*
* CodingBat.com problem from Recursion-1.
*/

public class SumDigits 
{

  public static int sumDigits(int n)
  {
    return (n == 0) ? 0 : n % 10 + sumDigits(n / 10);
  }
  
  public static void main(String[] args) 
  {
    System.out.println();
  }
}