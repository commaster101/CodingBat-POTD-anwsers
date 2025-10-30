import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * CodingBat Java Activity "make2" from Array-1.
 * codingbat.com
 */

public class Make2
{
	public static int[] make2(int[] a, int[] b)
	{
		return Arrays.copyOfRange(IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(), 0, 2);
	}

	public static void main(String[] args)
	{
		System.out.println();
	}
}
