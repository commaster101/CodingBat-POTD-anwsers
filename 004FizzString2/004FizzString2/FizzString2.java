/*
 * CodingBat Java Activity "fizzString2" from Logic-1 section.
 * codingbat.com
 */
public class FizzString2 
{
    public static String fizzString(int n)
    {
        switch (n % 15) {
            case 0: return "FizzBuzz!";
            case 3:
            case 6:
            case 9: 
            case 12: return "Fizz!";
            case 5:
            case 10: return "Buzz!";
            default:
                return n+"!";
        }
    }

    public static void main(String[] args)  
    {
        System.out.println();
    }
}
