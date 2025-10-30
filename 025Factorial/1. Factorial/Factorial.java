/* 
* Problem from CodingBat.com, Recursion-1.
*/

import java.util.stream.IntStream;

public class Factorial
{
  public static int factorial(int n)
  {
    return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
  }

  public static int factorial(int n, boolean useRecursive)//overloaded method
  {
    if (useRecursive){
      if (n == 0)
      return 1;
      return n * factorial(n - 1, true);
    }
    else return factorial(n);
  }

  public static void main(String[] args)
  {
    
  }
}