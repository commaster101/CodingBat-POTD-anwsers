public class Test_Fibonacci extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals(0, Fibonacci.fibonacci(0));
	}

	
	public static void case8() {
		  assertEquals(13, Fibonacci.fibonacci(7));
	}

	
	public static void case2() {
		  assertEquals(1, Fibonacci.fibonacci(1));
	}

	
	public static void case3() {
		  assertEquals(1, Fibonacci.fibonacci(2));
	}

	
	public static void case4() {
		  assertEquals(2, Fibonacci.fibonacci(3));
	}

	
	public static void case5() {
		  assertEquals(3, Fibonacci.fibonacci(4));
	}

	
	public static void case6() {
		  assertEquals(5, Fibonacci.fibonacci(5));
	}

	
	public static void case7() {
		  assertEquals(8, Fibonacci.fibonacci(6));
	}

	public static void main(String[] args) {
		case1();
		case8();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
	}
}
