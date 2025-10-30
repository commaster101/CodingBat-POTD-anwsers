public class Test_FizzArray extends GenericTestHarness
{
	
	public static void case6() {
		  assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6}, FizzArray.fizzArray(7));
	}

	
	public static void case3() {
		  assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, FizzArray.fizzArray(10));
	}

	
	public static void case2() {
		  assertArrayEquals(new int[] {0}, FizzArray.fizzArray(1));
	}

	
	public static void case1() {
		  assertArrayEquals(new int[] {0, 1, 2, 3}, FizzArray.fizzArray(4));
	}

	
	public static void case5() {
		  assertArrayEquals(new int[] {0, 1}, FizzArray.fizzArray(2));
	}

	
	public static void case4() {
		  assertArrayEquals(new int[] {}, FizzArray.fizzArray(0));
	}

	public static void main(String[] args) {
		case6();
		case3();
		case2();
		case1();
		case5();
		case4();
	}
}
