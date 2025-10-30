public class Test_FizzArray2 extends GenericTestHarness
{
	
	public static void case8() {
		  assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, FizzArray2.fizzArray2(11));
	}

	
	public static void case7() {
		  assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}, FizzArray2.fizzArray2(9));
	}

	
	public static void case3() {
		  assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, FizzArray2.fizzArray2(10));
	}

	
	public static void case6() {
		  assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6"}, FizzArray2.fizzArray2(7));
	}

	
	public static void case2() {
		  assertArrayEquals(new String[] {"0", "1"}, FizzArray2.fizzArray2(2));
	}

	
	public static void case1() {
		  assertArrayEquals(new String[] {"0", "1", "2", "3"}, FizzArray2.fizzArray2(4));
	}

	
	public static void case5() {
		  assertArrayEquals(new String[] {}, FizzArray2.fizzArray2(0));
	}

	
	public static void case4() {
		  assertArrayEquals(new String[] {"0"}, FizzArray2.fizzArray2(1));
	}

	public static void main(String[] args) {
		case8();
		case7();
		case3();
		case6();
		case2();
		case1();
		case5();
		case4();
	}
}
